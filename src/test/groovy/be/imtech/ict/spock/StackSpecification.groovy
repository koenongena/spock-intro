package be.imtech.ict.spock

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: fpape
 * Date: 2/19/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
class StackSpecification extends Specification {
    def "adding an element to a stack"() {
        given:
        def stack = new Stack<String>()
        def element = 'element'
        when:
        stack.push(element)
        then:
        stack.peek() == element
        stack.size() == 1
    }

    def "popping an element on an empty stack throws an exception"() {
        given:
        def stack = new Stack<String>()
        when:
        stack.pop()
        then:
        thrown(EmptyStackException)
        stack.empty
    }
}
