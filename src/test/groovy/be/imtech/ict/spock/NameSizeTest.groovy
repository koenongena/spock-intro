package be.imtech.ict.spock

import spock.lang.Specification
import spock.lang.Unroll

/**
 * User: Koen Ongena
 * Date: 20/02/13
 * Time: 21:27
 */
class NameSizeTest extends Specification {

    @Unroll("length of Austing Powers ally (#name) was supposed to be #length, but actually is #name.size()")
    def "verify name length"() {

        when:
        int nameSize = name.size()

        then:
        nameSize == length

        where:
        name                  | length
        "Basil Exposition"    | 16
        "Vanessa Kensington"  | 18
        "Felicity Shagwell"   | 17
        "Foxxy Cleopatra"     | 15
        "Marie Kensington"    | 16
        "Number 3"            | 8
        "Nigel Powers"        | 12
        "Commander Gilmour"   | 17
        "General Borschevsky" | 19

    }
}
