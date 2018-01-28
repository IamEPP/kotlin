package br.com.iamepp.challenge1

fun main(args: Array<String>) {
    val helloOne = "Hello"
    val helloTwo = "Hello"
    areThoseStringReferentiallyEqual(helloOne, helloTwo)
    areThoseStringsStructurallyEqual(helloOne, helloTwo)
    doSmartCast("The any type is the root of the kotlin class Hierarchy")
    printIndentedRawStringWithDefaultPrefix()
    printIndentedRawStringWith1AsPrefix()
}

private fun printIndentedRawStringWith1AsPrefix() {
    println(""" 1   1
                1  11
                1 111
                11111
    """.trimMargin("1"))
}

private fun printIndentedRawStringWithDefaultPrefix() {
    println("""   1
                |  11
                | 111
                |1111
    """.trimMargin())
}

private fun doSmartCast(any: Any) {
    if (any is String) {
        println(any.toUpperCase())
    }
}

private fun areThoseStringsStructurallyEqual(helloOne: String, helloTwo: String) {
    println("Is helloOne structurally equal to helloTwo ? ${helloOne == helloTwo} ")
}

private fun areThoseStringReferentiallyEqual(helloOne: String, helloTwo: String) {
    println("Is helloOne referentially equal to helloTwo ? ${helloOne === helloTwo} ")
}
