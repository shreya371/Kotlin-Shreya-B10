package com.employee

fun main(){
    var obj =Employee(101,"shreya",60000,20)
    obj.display()
    var res1=obj.calculatePerDaySalary(obj.empSalary)
    var res2=obj.totalSalaryEarned(obj.noOfDaysPresent,obj.empSalary)
    println("per day salary : $res1")
    println("total salary: $res2")
}

class Employee(var empId: Int, var empName: String, var empSalary: Int,var noOfDaysPresent:Int) {

    //secondary constructor
    /*constructor(empId: Int, empName: String, empSalary: Int) : this() {
        this.empId=empId
        this.empName=empName
        this.empSalary=empSalary*/
    fun display(){
        println("$empId , $empName,$empSalary,$noOfDaysPresent")
    }
    fun calculatePerDaySalary(empSalary:Int):Int{
        return empSalary/30
    }
    fun totalSalaryEarned(noOfDaysPresent: Int,empSalary:Int):Int{
        var res= noOfDaysPresent*calculatePerDaySalary(empSalary)
        return res
    }

}


