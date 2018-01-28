package br.com.iamepp.datatypes

import br.com.iamepp.java.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    printArrayTypes()
    exploreWaysOfInitializeArrays()
}

private fun exploreWaysOfInitializeArrays() {
    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(1000) { i -> i + 1 }
    for (number in lotsOfNumbers) {
        println(number)
    }

    val allZeroes = Array(100) { 0 }
    for (zero in allZeroes) {
        println(zero)
    }

    val lateInitArray: Array<Int>
    lateInitArray = Array(6) { i -> i + 1 * 10 }

    for (number in lateInitArray) {
        println(number)
    }


    var mixedArray = arrayOf("Hello", 10, BigDecimal(1.5), 'b')
    for (thing in mixedArray) {
        println(thing)
    }
    println(mixedArray is Array<Any>)


    val myIntArray = IntArray(19) { i -> i }
    DummyClass().printNumbers(myIntArray)

    val myIntArray2 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    DummyClass().printNumbers(myIntArray)
}


private fun printArrayTypes() {
    val longs = arrayOf(1L, 2, 3, 4, 5)
    val longs2 = arrayOf<Long>(1, 2, 3, 4, 5)
    val longs3 = arrayOf(1, 2, 3, 4, 5)
    println(longs is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)
}