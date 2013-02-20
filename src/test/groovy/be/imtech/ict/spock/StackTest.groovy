package be.imtech.ict.spock

import spock.lang.Specification

/**
 * User: Koen Ongena
 * Date: 20/02/13
 * Time: 21:15
 */
class StackTest extends Specification{

    Stack<String> underTest

    def setup(){
        underTest = new Stack<String>()
    }

    def "adding elements on stack"(){
        when:
        underTest.push("An element");

        then:
        underTest.size() == 1
        underTest.pop() == "An element"


    }
}
