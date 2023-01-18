package com.coditory.sandbox

import spock.lang.Specification

class CalculatorSpec extends Specification {
    def "should sum two numbers"() {
        when:
            int result = Calculator.sum(2, 2)
        then:
            result == 4
    }
}
