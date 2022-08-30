// Data Class
// 이름처럼 데이터를 넣어놓는 클래스

// 서버에서 데이터를 받아온 것을 넣어놓을 때

fun main(){

    val justDog = JustDog("파트라슈", 21)
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())

    val dataDog = DataDog("파트라슈 친구", 15)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())

    val dataDog2 = dataDog.copy(name = "파트라슈 여자친구")
    println(dataDog2.toString())

}


class JustDog(var name : String, var age : Int)
data class DataDog(var name : String, var age : Int)

