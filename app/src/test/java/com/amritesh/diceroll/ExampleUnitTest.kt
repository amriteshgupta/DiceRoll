package com.amritesh.diceroll

import org.junit.Test

import org.junit.Assert.*


class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice= MainActivity.Dice(6)
        val rollResult =dice.roll()
        assertTrue("The value of RollResult was not between 1 and 6", rollResult in 1..6)

    }
}