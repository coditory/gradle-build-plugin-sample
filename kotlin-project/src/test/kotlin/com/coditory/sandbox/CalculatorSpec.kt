package com.coditory.sandbox

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorSpec {
    @Test
    fun `should sum two numbers`() {
        assertEquals(4, Calculator.sum(2, 2))
    }
}
