package be.imtech.ict.spock.service;

import spock.lang.Specification;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:21
 */
public class PopQuizServiceTest extends Specification {

    PopQuizService testing

    def setup() {
        testing = null //implement
    }

    def "Justin Bieber is NOT a part of Coldplay"() {
        //test isJustinBieberAPartOfColdplay
    }

    def "the singer of a band is retrieved correctly"() throws Exception {
        //test getSinger
    }
}
