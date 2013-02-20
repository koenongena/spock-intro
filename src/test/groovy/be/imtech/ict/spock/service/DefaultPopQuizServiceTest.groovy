package be.imtech.ict.spock.service

import be.imtech.ict.spock.model.Band
import be.imtech.ict.spock.model.Singer
import be.imtech.ict.spock.repository.BandRepository;
import spock.lang.Specification
import spock.lang.Ignore
import spock.lang.Issue;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:21
 */
public class DefaultPopQuizServiceTest extends Specification {

    DefaultPopQuizService service

    BandRepository mockBandRepository

    def setup() {
        service = new DefaultPopQuizService()
        mockBandRepository = Mock(BandRepository)
        service.bandRepository = mockBandRepository

        mockBandRepository.containsBands() >> true
    }

    def "is service initialized"(){
        expect:
        service.initialized
    }

    @Issue("POPQ-1")
    def "Justin Bieber is NOT a part of Coldplay"() {
        given:
        mockBandRepository.getBand("coldplay") >> new Band(new Singer("Chris Martin"), new ArrayList<String>());

        when:
        def justinBieberIsPartOfColdplay = service.isJustinBieberAPartOfColdplay()

        then:
        !justinBieberIsPartOfColdplay
    }

    @Issue("POPQ-1")
    def "Justin Bieber is a part of Coldplay"() {
        mockBandRepository.getBand("coldplay") >> new Band(new Singer("Justin Bieber"), new ArrayList<String>());

        expect:
        service.isJustinBieberAPartOfColdplay()
    }

    def "the lead singer name of a band is retrieved correctly"() {
        given:
        mockBandRepository.getBand("coldplay") >> new Band(new Singer("Chris Martin"), new ArrayList<String>())

        when:
        String name = service.getLeadSingerName("coldplay")

        then:
        name == "Chris Martin"

    }

    def "override local interactions"(){
        given:
        mockBandRepository.containsBands() >> false

        when:
        service.getLeadSingerName("coldplay")

        then:
        thrown(IllegalStateException)
    }

    @Ignore
    def "are all these singers lead singers of the band"() {
        given:

        when:
        service.areAllTheseSingersLeadSingerOfTheBand()
        then:
        1 == 2
    }

}
