package exception

import java.lang.ArithmeticException
import java.util.*

fun main(){

    var sc =Scanner(System.`in`)
    try {
        println("enter num1")
        var num1 = sc.nextInt()
        println("enter num2")
        var num2 =sc.nextInt()
        println("result after division: ${num1/num2}")
    }
    catch(e:ArithmeticException){
        println("do not enter zero")
    }
    catch(e:InputMismatchException){
        println("enter only numbers")
    }
}