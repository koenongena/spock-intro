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
class SpockFriendsSpecification extends Specification {
    @Unroll("length of Spock's and his friend (#name) name is #length")
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name        | length
        "Kirk"      | 4
        "McCoy"     | 5
        "Nyota"     | 5
        "Hikaru"    | 6
        "Pavel"     | 5
        "Christine" | 9
    }
}
