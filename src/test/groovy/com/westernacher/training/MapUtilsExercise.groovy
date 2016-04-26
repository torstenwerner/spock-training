package com.westernacher.training

import spock.lang.Specification

import static com.westernacher.training.MapUtils.mapUtils

class MapUtilsExercise extends Specification {
    /**
     * Tests {@link MapUtils#difference(java.util.Map, java.util.Map)}. The test should check some useful combinations
     * of arguments and return values.
     */
    def 'test difference() with individual expressions'() {
        expect:
        mapUtils.difference([a: 'before'], [:]) == [a: 'before -> null']
        // mapUtils.difference([a: 'before'], [a: 'after']) == [no: 'idea']
    }

    /**
     * Test the same method in a data driven way. Use data tables.
     */
    def 'test difference() in a data driven way'() {
    }
}
