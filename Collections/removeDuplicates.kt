package collections

fun main(){
    var javaBatch= mutableListOf<String>("anil","gopal","ankit","manish")
    var kotlinBatch= mutableListOf<String>("ankit","kumar","manish","rahul")

    //combine into one batch
    //remove duplicates
    //sort data in ascending order
    println("--java batch----")
    println(javaBatch)
    println("------kotlin batch-----")
    println(kotlinBatch)

    javaBatch.addAll(kotlinBatch)
    println("adding kotlin batch to java batch")
    println(javaBatch)

    //removing duplicate elements using distinct function
    println("after removing duplicates")
    var javaBatchDistinct =javaBatch.distinct()
    println(javaBatchDistinct)

    println("sorting")

    javaBatchDistinct.sorted()
    println(javaBatchDistinct)



}