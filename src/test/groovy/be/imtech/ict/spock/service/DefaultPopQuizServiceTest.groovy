package be.imtech.ict.spock.service;

import spock.lang.Specification
import spock.lang.Ignore
import spock.lang.Issue;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:21
 */
public class DefaultPopQuizServiceTest extends Specification {

    PopQuizService service

    def setup() {
        service = null //implement
    }

    @Issue("POPQ-1")
    def "Justin Bieber is NOT a part of Coldplay"() {
        //test isJustinBieberAPartOfColdplay
    }

    @Issue("POPQ-1")
    def "Justin Bieber is a part of Coldplay"() {
        //test isJustinBieberAPartOfColdplay
    }

    def "the lead singer name of a band is retrieved correctly"() {
        //test getLeadSingerName
    }

    @Ignore
    def "are all these singers lead singers of the band"() {
        given:
        Map<String, String> singers = [
                'Chris Martin': 'Coldplay',
                'Bono': 'U2',
                'Freddie Mercury': 'Queen'
        ]

        when:
        def result = service.areAllTheseSingersLeadSingerOfTheBand(singers)

        then: "Yes they are all singers of the specified bands"
        result
    }

}
