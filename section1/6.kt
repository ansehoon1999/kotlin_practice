// 상속에 대해 간단하게 설명드리고 가겠습니다.
// 상속 -> 이름처럼 뭔가 물려받는다??

fun main(){

    //Job1()
    //Job2()
    Job3()
    Job4()
}

open class AllJobs() {

    init {
        println("일을 합니다.")
    }

}

class Job3() : AllJobs(){
    init {
        println("마케팅을 합니다.")
    }
}

class Job4() : AllJobs(){
    init {
        println("근로를 합니다.")
    }
}


class Job1() {

    init {
        println("일을 합니다.")
        println("코딩을 합니다.")
    }

}

class Job2() {

    init {
        println("일을 합니다.")
        println("디자인을 합니다.")
    }

}