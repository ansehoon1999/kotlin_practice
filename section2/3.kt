// 제네릭(generic)
// 컴파일시에 타입 체크를 할 수 있다 -> 컴파일
// 타입캐스팅이 필요없다.

// 람다 / 고차함수 / 제네릭

fun main(){

    /*
    val box1 = Box1(10)
    println(box1.value)
	
    val box2 = Box2("숫자 10")
    println(box2.value)
    
    val box1_1 = Box1("10".toInt())
    println(box1_1.value)
    
    val box3 = Box3(10)
    println(box3.value)
    
    val box4 = Box3("10")
    println(box4.value)
    */

    testFun1("abc")
    testFun2("a")
    testFun2(123)
    testFun3("a")
    testFun3(123)
}

fun testFun1(a : String) {
    println(a)
}

fun <T> testFun2(a : T) {
    println(a)
}

fun <A> testFun3(a : A) {
    println(a)
}

class Box1(test : Int) {
    var value = test
}

class Box2(test : String) {
    var value = test
}

class Box3<T>(test : T) {
    var value = test
}


