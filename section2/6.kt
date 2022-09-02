// infix function

fun main(){

    //println(sum(1,2))
    //println(10 sum1 20)
    //println(20 sum2 30)
    //println(10 multi1 10)
    //println(10 sum3 20)

    println("apple" sum1 "포도")
    println("사과" sum2 "포도")
    println(10 showList 20)
}

infix fun Int.showList(num : Int) : List<Int> {

    val list = mutableListOf<Int>()
    for (i in this..num) {
        list.add(i)
    }
    //println(this)
    return list

}

infix fun String.sum1(abc : String) : String = this + abc
infix fun String.sum2(abc : String) : String {
    return this + abc
}

infix fun Int.sum1(num : Int) : Int = this + num
infix fun Int.sum2(num : Int) : Int = this + num
infix fun Int.multi1(num : Int) : Int = this * num

infix fun Int.sum3(num : Int) : Int {
    return this + num
}

fun sum(a : Int, b : Int) : Int {
    return a+b
}
