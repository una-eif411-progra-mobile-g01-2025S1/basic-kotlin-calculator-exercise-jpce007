package org.example

class Calculator {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            println("ERROR: Cannot divide by zero.")
            return Double.NaN  // Return NaN if trying to divide by zero
        }
        return a / b
    }
}