// 엘비스 연산자(Elvis Operator)
// null 처리를 위해

// null -> null 사랑해??
// 아무것도 없는 것
// val str = ""   val number = 0

fun main() {

    /*
    var testStr1 : String = ""
    println(testStr1)
    
    var testStr2 = null
    println(testStr2)
    
    var testStr3 : String = "abcd"
    var testStr4 : String? = null
    */

    println(findStringLength4(null))

}

//fun findStringLength1(str : String) : Int {

//    return str.length
//}

//fun findStringLength2(str : String?) : Int? {

//    return str?.length
//}

//fun findStringLength3(str : String?) : Int {
//    var resultCount = 0
//    if(str != null) {
//        resultCount = str.length
//    }

//    return resultCount
//}

fun findStringLength4(str : String?) : Int {
    return str?.length ?: 0
}




