fun main(args: Array<String>) {
    var employee1 = EmployeeInfo("Sean Widdowson",22135,1)
    var employee2 = EmployeeInfo("Jason", 22136,2)
    var employee3 = EmployeeInfo("Freddie", 221337, 3) //Add employees
    employee1.printAll()
    employee2.printAll()
    employee3.printAll() // formatted data
    employee2.name = "Jeepers"
    employee3.shift = 1 // set employee name and shift
    employee1.printAll()
    employee2.printAll()
    employee3.printAll() // formatted new data
    println(employee2.name)
    println(employee3.shift)
    println(employee1.employeeNumber) //get properties
}