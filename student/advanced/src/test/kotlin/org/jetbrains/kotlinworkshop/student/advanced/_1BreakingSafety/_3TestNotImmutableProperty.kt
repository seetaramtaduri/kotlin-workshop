package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety


import org.junit.jupiter.api.Test
import kotlin.test.assertNotEquals


class TestNotImmutableProperty {
    @Test
    fun testDifferentValues() {
        val myClass = MyClass()
        assertNotEquals(
                myClass.myProperty, myClass.myProperty, "Property should return different values")
    }
}