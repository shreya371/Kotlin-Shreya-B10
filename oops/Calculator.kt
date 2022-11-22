import java.util.Scanner

fun main(){
    //menu driven
    var sc=Scanner(System.`in`)
    println("enter num1 ")
    var num1= sc.nextInt()
    println("enter num2")
    var num2 =sc.nextInt()

    var cal=Calculation(num1,num2)

    println("1.add \n2.subtract \n3.multiply \n4.divide")
    println("Enter choice")
    var choice=sc.nextInt()
    if (choice<5){
        when (choice){
            1 -> println(cal.add(num1,num2))
            2 -> println(cal.sub(num1,num2))
            3 -> println(cal.mul(num1,num2))
            4 -> println(cal.div(num1,num2))
            else -> println("invalid choice")
        }
    }
}
class Calculation(var num1:Int,var num2:Int){
    fun add(num1:Int,num2:Int):String{
        return "addition of $num1 and $num2 : ${num1+num2}"
    }
    fun sub(num1:Int,num2:Int):String{
        return "addition of $num1 and $num2 : ${num1-num2}"
    }
    fun mul(num1:Int,num2:Int):String{
        return "addition of $num1 and $num2 : ${num1*num2}"
    }
    fun div(num1:Int,num2:Int):String{
        return "addition of $num1 and $num2 : ${num1/num2}"
    }

}
