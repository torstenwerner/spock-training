package com.westernacher.training

import spock.lang.Specification

class SimpleTests extends Specification {
    int add(int a, int b) {
        // return 0;
        // return a;
        return a + b;
    }

    void 'test add() the verbose way'() {
        given:
        int a1 = 0;
        int b1 = 0;

        when:
        int c1 = add(a1, b1);

        then:
        c1 == 0;

        and:
        int a2 = 1;

        when:
        int c2 = add(a2, b1);

        then:
        c2 == 1;

        and:
        int b2 = 1;

        when:
        int c3 = add(a2, b2);

        then:
        c3 == 2;

        and:
        int a3 = 23;
        int b3 = -42;

        when:
        int c4 = add(a3, b3);

        then:
        c4 == -19;
    }

    void 'test add() the compact way'() {
        expect:
        add(a, b) == c

        where:
        a  | b   || c
        0  | 0   || 0
        1  | 0   || 1
        1  | 1   || 2
        23 | -42 || -19
    }
}
