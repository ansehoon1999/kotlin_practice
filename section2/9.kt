// enum(enumerations) class

fun main(){

    /*
    println(Direction.NORTH)
   
  	Direction.values().forEach {
        println(it)
    }
  	
    CustomerType.values().forEach {
        println(it)
    }
    

	val direction = Direction.EAST

    when(direction) {
     	Direction.NORTH -> {
            println("N")
        }
        Direction.SOUTH -> {
            println("S")
        }
        Direction.WEST -> {
            println("W")
        }
        Direction.EAST -> {
            println("E")
        }
    }
    
    
    
    val color = Color.GREEN
    
    when(color) {
        Color.RED -> {
            println(Color.RED.colorName)
        }
        Color.GREEN -> {
            println(Color.GREEN.colorName)
        }
        Color.BLUE -> {
            println(Color.BLUE.colorName)
        }
    }
    
    */

    println(Device.DEVICEON.status)

    Device.DEVICEON.status = "OFF"

    println(Device.DEVICEON.status)
}

enum class Device(var status : String){
    DEVICEON("ON"),
    NETWORK("OFF"),
    LOCATIOn("SEOUL")
}

enum class Color(val colorName : String) {
    RED("빨강"),
    GREEN("초록"),
    BLUE("파랑")
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class CustomerType {
    A, B, C, D, VIP
}

