// 고차함수 (Higher-Order Function)
// f(x) = x -> f(f(x)) = x

fun main(){

    //sum(1,2, { a : Int, b : Int -> a + b})
    //sum(1,2) { a : Int, b : Int -> a + b}
    sum(1,2, ::testSum)

    //printTest("abc")
    //highPrintTest(::printTest)
    test1()
    test2()
    test3()
}

fun test1() : Unit {
    println("abc")
}

fun test2() : Unit {
    println("abc2")
    return
}

fun test3() : Unit {
    println("abc3")
    return Unit
}


fun printTest(aaasdasd : String) {
    println(aaasdasd)
}

fun highPrintTest(abc : (String) -> Unit) {
    abc("bbb")
}


fun sum(a : Int, b : Int, operation : (Int, Int) -> Int) {
    println("$a $b")
    println(operation(a,b))
}


fun testSum(a : Int, b : Int) : Int {
    return a+b
}

val testLambdaSum = {a : Int, b : Int -> a+b}
