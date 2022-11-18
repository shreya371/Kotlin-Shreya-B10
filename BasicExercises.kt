import java.util.Scanner

fun main(){
    var sc =Scanner(System.`in`)
    //1.Swapping of two number
    //  a)With temporary variable
    //  b)With out temporary variable

    var a:Int = 20;
    var b:Int =30;
    var temp : Int;
    println("Before swapping: $a ,$b")
    temp = a;
    a=b;
    b=temp;
    println("After Swapping : $a ,$b")

    println("----without temp variable-----------")
    //without temp var  variable
    var a1:Int = 20;
    var b1:Int =30;

    println("Befor swapping:$a1 $b1")
    var c:Int =a1*b1;
    a1=c/a1;
    b1=c/b1;
    println("After swapping:$a1 $b1")

    //2)check whether the year is leap year or not.

    println("Enter year to check if it is Leap year")
    var year=sc.nextInt();
    var result=if(year%4==0){
        if (year%100==0){
            if(year%400==0){
                println("$year is a leap year")
            }
            else println("$year is not a leap year")
        }
        else println("$year is  a leap year")
    }
    else println("$year is not a leap year")

    //3) factorial of a number
    println("Enter number to check Factorial")
    var number:Long = sc.nextLong()

    fun factorial(number:Long):Long{
        if(number== 0L|| number==1L) {
            return 1L
        }
        return number*factorial(number-1)

    }
    var factorialResult =  factorial(number);
    println("Factorial of $number is $factorialResult")

    //4)Fibonacci series
    println("Enter the limit for fibonacci series")
    var limit:Int = sc.nextInt()
    var fib_a:Int = 0;
    var fib_b:Int=1;
    for( i in 1..limit){
        var fib_c=fib_a+fib_b;
        print("$fib_c ")
        fib_a=fib_b
        fib_b=fib_c
    }
    println()

    //5)program to reverse a number
    println("Enter number to reverse")
    var number_rev:Int=sc.nextInt()
    while (number_rev>0){
        var remainder=number_rev%10
        print("$remainder")
        number_rev/=10
    }
    println()
    // 6) using for loop to print even number between 1 to 20

    for (i in 1..20 ){
        if(i%2==0) {
            print("$i ")
        }
    }
    println()
    //7)check whether the number is palindrome or not.
    //var palindrome:Int=sc.nextInt()
    println("enter number to check if is palindrome or not")
    var num:Int=sc.nextInt()
    var num1:Int =num
    var reverse = 0

    while(num > 0) {
        var rem = num % 10
        reverse = reverse * 10 + rem
        num /= 10
    }
    println(reverse)
    if(num1==reverse){
        println("it is palindrome")
    }
    else{
        println("not a palindrome")
    }

    //8)print the  pattern
    //
    //      *
    //    * *
    //  * * *
    // * * * *
    //* * * * *

    println("Enter number of rows: ")
    var row:Int=sc.nextInt()
    for(i in 1..row){
        for(j in 1..i){
            print("* ")
        }
        println()
    }

    //9)check whether the number is Armstrong number or not
    //sum of cubes of digits equal to given number
    println("Enter number to check if it is armstrong number:")
    var armstrong:Int =sc.nextInt()
    var armstrong1=armstrong
    var arm_result :Int =0
    while (armstrong>0){
        var r=armstrong%10
        arm_result += r*r*r
        armstrong/=10
    }
    if (armstrong1 == arm_result) println("$armstrong1 is an armstrong number")
    else println("$armstrong1 is not an armstrong number")

    //10) print the pattern
    //1
    //2 1
    //3 2 1
    //4 3 2 1
    //5 4 3 2 1
    println("Enter number of rows: ")
    var row1:Int= sc.nextInt()
    for (i in 1..row1){
        for (j in  i downTo 1){
            print("$j")
        }
        println()
    }




    }














