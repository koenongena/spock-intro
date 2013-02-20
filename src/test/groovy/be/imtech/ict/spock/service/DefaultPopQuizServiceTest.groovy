package be.imtech.ict.spock.service;

import spock.lang.Specification;

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

    def "Justin Bieber is NOT a part of Coldplay"() {
        //test isJustinBieberAPartOfColdplay
    }

    def "Justin Bieber is a part of Coldplay"() {
        //test isJustinBieberAPartOfColdplay
    }

    def "the lead singer of a band is retrieved correctly"() {
        //test getSinger
    }
}
