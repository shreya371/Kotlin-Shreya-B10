package string

fun main(){
    //string is inbuilt class in kotlin
    //sequence of characters
    //array of characters
    //we can access characters using index
    var name :String="Shreya"
    println("$name")
    print(name[0])

    /*strings are of two types
       1)Escaped String - it may have escape characters like \n \r etc..it is enclosed with " escaped string "
       2)Raw String - do not support escape characters . it is enclosed with """ raw string """
    */

    //escaped string
    var escapedString="this is \n escaped string"
    println(escapedString)

    //raw String
    var rawString="""  
        |this is raw string
        |we can write in new line without new line character
    """.trimMargin("|")
    //trimMargin() : leading white spaces are removed using trimMargin() ,any parameter can be passed instead of "|"
    println(rawString)

    //length
    println("length of string ${name.length} ")

    //indices
    println("indices of string ${name.indices} ")

    //last index of string
    println("last index of string ${name.lastIndex} ")

    //converts string to uppercase
    println("UpperCase of string ${name.uppercase()} ")

    var name2:String="hello"

    //checks if two strings are equal
    println( name2.equals(name))

    //concatenation of name and name2
    println(name.plus(name2))

}
