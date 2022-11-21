package arrayExercise

import java.util.Scanner

fun main(){
    //1) sort array in ascending order
    var sc =Scanner(System.`in`)
    println("Enter size of array")
    var s=sc.nextInt()
    var arr1 = Array(s,{0})
    for (i in 0..s-1){
        arr1.set(i,sc.nextInt())
    }

    //bubble sort
    for (i in 0..s-1){
        for (j in i+1..s-1){
            if (arr1[i] > arr1[j]){
                var temp =arr1[i]
                arr1[i]=arr1[j]
                arr1[j]=temp

            }
        }
    }
    print("ascending order of arr1 : ")
    for(i in arr1){
        print("$i ")
    }

    //2)sort the array in descending order

    for (i in 0..s-1){
        for (j in i+1..s-1){
            if (arr1[i] < arr1[j]){
                var temp =arr1[i]
                arr1[i]=arr1[j]
                arr1[j]=temp

            }
        }
    }
    println()

    print("descending order of arr1 : ")
    for(i in arr1){
        print("$i ")
    }


    //5)print second largest element
    println()
    print("Second largest element: ${arr1[1]}")

    println()
    //3) smallest element
    var min=arr1[0]
    for (i in arr1){
        if (i<min){
            min=i
        }
    }
    print("Minimum element of arr1 : $min")

    println()
    //4)largest element
    var max=arr1[0]
    for (i in arr1){
        if (i>max){
            max=i
        }
    }
    println("Maximum element of arr1 : $max")

    //6)sum of elements
    var sum:Int =0
    for (i in arr1){
        sum=sum+i
    }
    println("Sum of the elements : $sum")


}