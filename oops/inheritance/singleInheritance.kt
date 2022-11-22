package inheritance
//single inheritance: Employee class inherits from Person class
/*
        Person
          |
        Employee
 */
fun main(){
    //object creation
    var employee=Employee()
    employee.displayEmployeeInfo()

}

//by default classes in kotlin are - final, we need to write open to extend the parent class
open class Person(){
    protected var name:String="Shreya" // name is protected ,so it can be accessed inside inherited class
    private var age:Int=20 // age is private variable, so it cannot be accessed outside the class

}

class Employee:Person(){
    var employeeId:Int=101
    var employeeSalary:Double=30000.0

    fun displayEmployeeInfo(){
        println("----------------Details of Employee--------------")
        println("name = $name,employeeId = $employeeId, employeeSalary = $employeeSalary")
    }

}
