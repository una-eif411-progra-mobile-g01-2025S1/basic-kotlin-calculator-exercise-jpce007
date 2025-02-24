package org.example

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
class CalculatroTest {
    private lateinit var calculator : Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }
    @Test
    fun testAddition() {
        val result = calculator.add(5.0, 15.0)
        assertEquals(20.0, result)
    }

    @Test
    fun testSubtraction() {
        val result = calculator.subtract(60.0, 30.0)
        assertEquals(30.0, result)
    }

    @Test
    fun testMultiplication() {
        val result = calculator.multiply(40.0, 3.0)
        assertEquals(120.0, result)
    }

    @Test
    fun testDivision() {
        val result = calculator.divide(20.0, 2.0)
        assertEquals(10.0, result)
    }

    @Test
    fun testDivisionByZero() {
        val result = calculator.divide(22.0, 0.0)
        assertTrue(result.isNaN(), "Result should be NaN when dividing by zero")
        //Nan asumo que es Null en Kotlin
    }

    @Test
    fun testLargeNumbers() {
        val result = calculator.add(1e+30, 1e+30)
        assertEquals(2e+30, result)
    }
}