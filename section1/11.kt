// 중첩 클래스 (Nested class)
// 내부 클래스 (Inner class)

// 중첩 클래스 -> 객체지향 / 캡슐화 
// 내부 클래스 -> RecyclerView 

fun main(){

    val test1 = Test1.Test1NestedClass()
    test1.testFun1()

    val test2 = Test2().Test2InnerClass()
    test2.testFun2()
}


class Test1 {

    val tempText1 = "tempText1"

    class Test1NestedClass {

        fun testFun1(){
            println("TestFun1")
            //println(tempText1)
        }

    }

}

class Test2 {

    val tempText2 = "tempText2"

    inner class Test2InnerClass{

        fun testFun2(){
            println("TestFun2")
            println(tempText2)
        }

    }

}





