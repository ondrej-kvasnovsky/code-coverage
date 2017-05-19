package com

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class MainJavaTest extends Specification {

    @Subject
    MainJava mainJava

    def "Test1"() {
        when:
        def r = mainJava.test1()

        then:
        r == "result"
    }

    def "Test2"() {
        when:
        def r = mainJava.test2()

        then:
        r == "result"
    }

    def "Test3"() {
        when:
        def r = mainJava.test3()

        then:
        r.apply("") == "result"
    }

    def "Test4"() {
        when:
        def r = mainJava.test4()

        then:
        r == "result"
    }
}
