package br.com.iamepp.main

import org.junit.Assert.assertEquals
import org.junit.Test

class TwoferTest {

    @Test
    fun noNameGiven() {
        assertEquals("One for you, one for me.", twofer())
    }

    @Test
    fun aNameGiven() {
        assertEquals("One for Alice, one for me.", twofer("Alice"))
    }

    @Test
    fun anotherNameGiven() {
        assertEquals("One for Bob, one for me.", twofer("Bob"))
    }

    @Test
    fun emptyStringGiven() {
        assertEquals("One for , one for me.", twofer(""))
    }

}
