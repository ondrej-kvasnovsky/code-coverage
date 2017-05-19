package com

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class MainGroovyTest extends Specification {

    @Subject
    MainGroovy mainGroovy

    def "Test1"() {
        when:
        def r = mainGroovy.test1()

        then:
        r == "result"
    }

    def "Test2"() {
        when:
        def r = mainGroovy.test2()

        then:
        r == "result"
    }

    def "Test3"() {
        when:
        def r = mainGroovy.test3()

        then:
        r() == "result"
    }

    def "Test4"() {
        when:
        def r = mainGroovy.test4()

        then:
        r == "result"
    }
}
