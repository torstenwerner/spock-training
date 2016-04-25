package com.westernacher.training

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

@Ignore
class UnrollTest extends Specification {
    @Unroll
    def "maximum of #a and #b is #c"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        4 | 5 | 4
    }
}
