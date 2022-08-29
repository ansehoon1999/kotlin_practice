// 문자열 가공
// 유저가 입력한 데이터를 가공하거나
// 서버에서 가져온 데이터를 알맞게 가공해서 쓰거나

fun main() {

    //val testString = "동해물과 백두산이 마르고 닳도록"

    //val replaceValue = testString.replace("백두산", "한라산")

    //println(replaceValue)


    //val splitString = testString.substring(0, testString.length-1)

    //println(splitString)

    //val a = testString[1]
    //val b = testString[2]
    //println(a.toString() +b.toString())

    //val newTestString = testString.split(" ")
    //println(newTestString)
    //println(newTestString[0])
    //println(newTestString[1])

    val testList = ArrayList<String>()
    testList.add("abc1@naver.com")
    testList.add("abc2@google.com")
    testList.add("abc3@daum.com")
    testList.add("abc4@kakao.com")
    testList.add("abc5@naver.com")
    testList.add("abc6@kakao.com")
    testList.add("abc7@naver.com")

    // 저는 저기 이메일이 @다음에 naver라고 적힌 이메일의 갯수를 찾고 싶어요!
    // 2가지가 있습니다.

    // 첫번째 방법으로는 naver라는 텍스트가 포함되었는지 찾기
    // 첫번쨰 방법의 문제는 -> naver@google.com

    // 두번째 방법으로는 @뒤에 naver라고 텍스트가 있고 그 다음에 .이 이어진 이메일이 몇개인지 찾기
    // ******@naver.

    val emailList = ArrayList<String>()

    for (item in testList) {
        println(item.split("@")[1].split(".")[0])
        emailList.add(item.split("@")[1].split(".")[0])
    }

    println(emailList)

    var count = 0

    for (item in emailList) {
        if(item == "naver") {
            count++
        }
    }

    println(count)



}

