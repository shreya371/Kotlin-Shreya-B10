fun main(){
    /*for (i in 1..10){
        println(i)
    }
    println("---------downto----------")
    for (i in 5 downTo 1){
        println(i)
    }
    println("-------step--------")
    for (i in 1..10 step 2){
        println(i)
    }*/

    //user input
    /*var sc = Scanner(System.`in`)
    println("enter value")
    var input:Int =sc.nextInt();
    println("value is $input")
    var tableName:Int=sc.nextInt()
    var tableLimit :Int=  sc.nextInt();
    for(i in 1..tableLimit){
        println("$tableName * $i = ${tableName *  i}")
    }*/


    for(i in 1..5){
        for (j in 1..5){
            print("$i,$j, ")
        }
        println()
    }

    //pattern 1

    var row:Int =5
    //var column:Int = 5
    //pattern 1
    for(i in 1..row){
        for (j in 1..i){
            print("*")
        }
        println()
    }

    //pattern 2
    for(i in 1..row){
        for (j in 1..i){
            print("$j")
        }
        println()
    }


    //pattern 3
    for(i in 1..row){
        for (j in 1..i){
            print("$i")
        }
        println()
    }
    //pattern 4
    //val c = 'a'
    //val ascii = c.toInt()
    //println(ascii)

    var num=65;
    var ch = num.toChar();
    //println(ch)
    for(i in 1..row){
        for (j in 1..i){
            print("$ch")

        }
        ch++
        println()
    }

    //pattern 5
    for(i in 1..row){
        for (j in 1..row){
            if (i==1 || i==row)
                   print("*")
            else  {
                if (j==1||j==row){
                    print("*")
                }
                else{
                    print(" ")
                }
            }
        }

        println()
    }





}