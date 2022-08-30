// 상속(inheritance)과 오버라이딩(overriding)
// 
// 상속
// 자식 클래스가 부모 클래스의 멤버를 물려받고 ~
// 
// 오버라이딩
// 부모클래스의 메스드를 자식클래스에서 재정의해서 사용할수 있고 ~

// 처음의 클래스 설명드릴 때 
// 붕어빵 틀 

fun main(){

    //Parents().disease()
    Child().doing()
    Child().disease()

}


open class Parents() {

    fun doing() {
        println("자식을 돌봅니다.")
    }

    open fun disease() {
        println("비염이 있습니다.")
    }

}

class Child() : Parents(){

    override fun disease(){
        //super.disease()
        println("겁이 많습니다.")
    }


}

