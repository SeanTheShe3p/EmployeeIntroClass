import java.util.StringJoiner
import kotlin.time.measureTimedValue

class EmployeeInfo constructor(var name:String, var employeeNumber:Int, var shift:Int){
    init{
        println("Added "+name)
    }
    fun printAll(){
        println("Employee: "+name+"\nEmployee Number: "+employeeNumber.toString()+" Shift: "+shift.toString())
    }
}