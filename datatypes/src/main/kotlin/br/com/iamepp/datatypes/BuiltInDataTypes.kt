package br.com.iamepp.datatypes

import br.com.iamepp.java.DummyClass

fun main(args: Array<String>) {
    val myInt: Int = 10
    val myLong = 10L
    val myByte = 111
    val myShort: Short = myByte.toShort()
    val myDouble = 65.984
    val myFloat = 55.8F
    var myChar = 'b'

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

}
