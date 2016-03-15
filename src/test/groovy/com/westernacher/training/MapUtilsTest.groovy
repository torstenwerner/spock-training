package com.westernacher.training

import spock.lang.Specification

import static com.westernacher.training.MapUtils.mapUtils

class MapUtilsTest extends Specification {
    def difference() {
        expect:
        mapUtils.difference([:], [:]) == [:]
        mapUtils.difference([a: 'before'], [:]) == [a: 'before -> null']

        when:
        def before = [a: 'before']
        mapUtils.difference(before, [:])

        then: 'do not modify input arguments'
        before == [a: 'before']

        expect:
        mapUtils.difference([:], [a: 'after']) == [a: 'null -> after']
        mapUtils.difference([a: 'before'], [a: 'after']) == [a: 'before -> after']
        mapUtils.difference([a: 'before'], [a: 'before']) == [:]
        mapUtils.difference([a: 'before', b: 'before', d: 'before'], [b: 'after', c: 'after', d: 'before']) == [
                a: 'before -> null',
                b: 'before -> after',
                c: 'null -> after'
        ]
        // 'a human readable representation'
        [a: 'before', b: 'after'].toString() == '[a:before, b:after]'
    }
}
