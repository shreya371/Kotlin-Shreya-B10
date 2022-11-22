package inheritance

//Hierarchical inheritance : class car and bike inherits from Vehicle class
/*
        vehicle
         /    \
        car  Bike
 */
fun main(){
    //objects creation
    var car=Car("Activia","Skoda",5)
    println("--------------------------------------------------------")
    car.startVehicle()
    car.drive()
    car.stop()
    car.displayCarInfo()

    var bike=Bike("electric","ola",true)
    println("-------------------------------------------------------------")
    bike.startVehicle()
    bike.drive()
    bike.stop()
    bike.displayCarInfo()
}

open class Vehicle(name:String,brand:String){
    var name=name
    var brand=brand

    fun startVehicle(){

        println("${brand+name} started")
    }
    fun drive(){
        println("Driving")
    }
    fun stop(){
        println("Vehicle Stopped")
    }
}
class Car(name:String,brand:String,seatingCapacity:Int):Vehicle(name,brand){
    var seatingCapacity=seatingCapacity
    fun displayCarInfo(){
        println("name: $name \nbrand: $brand \nseating Capacity: $seatingCapacity")
    }
}
class Bike(name:String,brand:String,isElectric:Boolean):Vehicle(name,brand){
    var isElectric=isElectric
    fun displayCarInfo(){
        println("name: $name \nbrand: $brand \nisElectric: $isElectric")
    }
}