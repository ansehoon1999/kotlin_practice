// 점수가 50점 이상인 사람들 출력하기

fun main() {

    val student = mutableMapOf<Int, String>()
    student[99] = "민지"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "하영"
    student[22] = "수진"
    student[45] = "수달"
    student[88] = "캥거루"
    student[91] = "코알라"
    student[87] = "악어"
    student[54] = "코끼리"
    student[42] = "하마"


    // 점수가 50점 이상인 사람들의 이름만 반복문과 조건문을 통해서 출력하세요~ :)
    // 민지, 하영, 캥거루, 코알라, 악어, 코끼리


    val testList = ArrayList<String>()

    for (i in student){
        if(i.key >= 50){
            println(i.value)
            testList.add(i.value)
        }
    }

    println(testList)

}