// Kotlin Scope function
// let / with / run / apply / also

// To help you choose the right scope function for your case, we'll describe them in detail and provide usage recommendations. Technically, functions are interchangeable in many cases, so the examples show the conventions that define the common usage style.

// let ->  let is often used for executing a code block only with non-null values. To perform actions on a non-null object, use the safe call operator ?. on it and call let with the actions in its lambda.
// non null 일 때 동작하고, null일 때 동작하지 않도록

// with ->  We recommend with for calling functions on the context object without providing the lambda result. In the code, with can be read as “ with this object, do the following.”
// 컨텍스트 내부에서 함수를 호출

// run -> run is useful when your lambda contains both the object initialization and the computation of the return value.
// 객체 초기화와 return값 계산이 필요할 때 주로 사용

// apply -> Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object. The common case for apply is the object configuration. Such calls can be read as “ apply the following assignments to the object.”
// 값을 반환하지 않고, 객체 구성에 대해 주로 사용

// also -> When you see also in the code, you can read it as “ and also do the following with the object.”
// 객체에 대해 추가적인 작업

fun main(){

    // let
    /*
 	val str : String? = "hi"
    
    //println(str?.length)
    
    val length = str?.let {
        println(it)
        it.length
    }
    
    println(length)
    
    val str2 : String? = null
    val length2 = str2?.let {
        println(it)
        println("실행실행")
        it.length
    }
    println(length2)
    */

    // with
    /*
    val numbers = mutableListOf("a", "b", "c", "d")
    println(numbers.first())
    println(numbers.last())
    
    val firstAndLast = with(numbers){
        "${first()} ${last()}"
    }
    
    println(firstAndLast)
    */


    // run
    /*
    val service = multiPortService("www.naver.com", 80)
    val result1 = service.query(service.prepareRequest() + " to port ${service.port}")

    println(result1)

    val result2 = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    println(result2)
    */

    // apply
    /*
    val tester1 = Person("Tester1")
    println(tester1)
    
    tester1.age = 20
    tester1.city = "Seoul"
    
    println(tester1)
    
    val tester2 = Person("Tester2").apply{
        age = 21
        city = "Busan"
    }
    
    println(tester2)
    */

    // also

    val numbers = mutableListOf(1,2,3,4)
    println("$numbers 여기에서 5를 추가합니다.")
    numbers.add(5)
    println(numbers)

    val numbers2 = mutableListOf(1,2,3,4)
    numbers2.also {
        println("$numbers2 여기에서 5를 추가합니다.")
    }.add(5)

    println(numbers2)

}

data class Person(
    var name : String,
    var age : Int = 0,
    var city : String = ""
)


class multiPortService(var url : String, var port : Int) {
    fun prepareRequest() : String = "기본 요청 url $url"
    fun query(request : String) = "결과 query $request"
}


