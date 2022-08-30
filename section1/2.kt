// Any
// 이름처럼, 아무거나 할 수 있는 느낌?
// 모든 아이들을 포함하는 조상같은 친구?

// is as

// is -> 맞나? 확인
// as -> type casting -> 타입 변경/체크

fun main(){

    /*
    var str1 : String = "abc"
    println(str1)
    str1 = 123
    println(str1)


    var str2 : Any = "abc"
    println(str2)
    str2 = 123
    println(str2)



    var str3 : Any = 123

    if(str3 is String) {
        println("this is string")
    } else {
        println("this is not string")
    }



    var str4 : Any = 123L

    when(str4) {
        is Int -> { println("this is int")}
        is String -> {println("this is string")}
       	else -> {
            println("this is else")
        }
    }

    */

    //var str5 : String = "abc"
    //var str6 : String = str5 as String

    //println(str6)

    //var str7 : Int = 1
    //var str8 : String = str7 as String

    var str9 : String? = "abc" as? String
    println(str9)


}