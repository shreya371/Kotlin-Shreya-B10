fun main(){
    var fruits = mutableListOf<String>("Apple","Mango")
    println(fruits)
    fruits.add("banana")
    fruits.add("orange")
    fruits.add("grapes")
    println(fruits)
    //remove
    println(fruits.remove("Apple"))
    println(fruits)

}
