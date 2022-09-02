// 지연초기화
// lateinit / lazy

fun main(){

    /*
 	var justString : String = "아무거나 스트링"
    
    println(justString)
    
    justString = "변경된 스트링"
    
    println(justString)
    */

    lateinit var lateString : String


    lateString = "a"
    lateString = "b"

    //println(lateString)

    // 만약 서버에서 데이터를 받아오는 일이 생길 수도 있죠?
    // 서버에서 받아온 데이터를 넣어두고 싶은데, 미리 변수를 선언해놓고
    // 나중에 서버에서 값을 받아와서 넣어줄 때 주로 사용합니다.

    //lateString = "변경된 스트링"

    //println(lateString)

    val lazyString : String by lazy {
        println("이 친구가 만들어질 때 프린트")
        "lazyTestString"
    }
    lazyString
    //println(lazyString)


}
