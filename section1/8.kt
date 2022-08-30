// 추상클래스(absctract class)

// class -> 붕어빵 틀
// abstract class -> 기존에는 비어있고
// 꽉 채워서 붕어빵을 만들어야 하는 틀

// 공통적으로 기능을 구현해줘야할 때

fun main(){


    BMW().wheel()

    Benz().wheel()
}


abstract class Car {

    abstract fun wheel()

    abstract fun engine()

}

class BMW() : Car() {

    override fun wheel(){
        println("BMW 굴러갑니다.")
    }

    override fun engine(){
        println("BMW 시동걸렸습니다.")
    }


}

class Benz() : Car() {

    override fun wheel(){
        println("Benz 굴러갑니다.")
    }

    override fun engine(){
        println("Benz 시동걸렸습니다.")
    }
}


/*
open class Car {
    
    open fun wheel(){
        println("굴러갑니다.")
    }
    
    open fun engine(){
        println("시동이 켜졌습니다.")
    }
    
}


class Bike() : Car() {
    
    override fun wheel(){
        println("자전거가 굴러갑니다.")
    }
    
}
*/

