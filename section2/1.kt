// 람다(lambda)
// 


fun main(){

    /*
    println(sum(1,2))
    println(sumNumber(1,2))
    println(sumTypeNumber(1,2))
    println(sumTypeNumberNull(1,2))
    */

    println(sumString("1", "2"))
    println(sumStringTwo("1","2"))
    println(sumStringTypeTwo("1","2"))
}


fun sumString(a : String, b : String) : String {
    return "string1 : $a string2 : $b"
}

val sumStringTwo = {a : String, b : String -> "string1 : $a string2 : $b"}
val sumStringTypeTwo : (String, String) -> String = {a,b -> "string1 : $a string2 : $b"}

fun sum(a : Int, b : Int) : Int {
    return a+b
}

val sumNumber = {a : Int, b : Int -> a + b}
val sumTypeNumber : (Int, Int) -> Int = {a, b -> a+b}
val sumTypeNumberNull : (Int, Int) -> Int? = {_, _ -> null}

fun a() : String {
    return "text"
}

fun b() = "text"