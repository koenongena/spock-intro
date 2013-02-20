package be.imtech.ict.spock

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created with IntelliJ IDEA.
 * User: fpape
 * Date: 2/19/13
 * Time: 9:30 PM
 * To change this template use File | Settings | File Templates.
 */
class AustinPowersAlliesSpecification extends Specification {
    @Unroll("length of Austing Powers ally (#name) is #length")
    def "length of Austing Powers allies names"() {
        expect:
        name.length() == length

        where:
        name                  | length
        'Basil Exposition'    | 16
        'Vanessa Kensington'  | 18
        'Felicity Shagwell'   | 17
        'Foxxy Cleopatra'     | 15
        'Marie Kensington'    | 16
        'Number 3'            | 8
        'Nigel Powers'        | 12
        'Commander Gilmour'   | 17
        'General Borschevsky' | 19
    }
}
