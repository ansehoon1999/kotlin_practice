// 인터페이스(interface)
//
// 추상클래스 비슷해요 비슷하게
// 꼭 채워넣어야 하는 붕어빵 틀인데
// 이거 자체가 작은 틀이라서 다른 틀에 여러개를 넣을 수 있음

// 클래스의 상속 / 오버라이딩 오버로딩 / 추상클래스 인터페이스

fun main(){

    BMW().autoParking()
}


abstract class Car {

    abstract fun wheel()

    abstract fun engine()

}

interface CarAutoDriving{
    fun autoDriving()
}

interface CarAutoParking{
    fun autoParking()
}


class BMW() : Car(), CarAutoDriving, CarAutoParking {

    override fun wheel(){
        println("BMW 굴러감")
    }

    override fun engine(){
        println("BMW 엔진시동")
    }

    override fun autoDriving(){
        println("BMW 자율 주행")
    }

    override fun autoParking(){
        println("BMW 자동주차")
    }

}


class Benz() : Car() {

    override fun wheel(){
        println("BMW 굴러감")
    }

    override fun engine(){
        println("BMW 엔진시동")
    }

    fun autoParking(){
        println("BENZ 자동 주차")
    }

}