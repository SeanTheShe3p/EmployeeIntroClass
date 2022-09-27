fun main(args: Array<String>) {
    var employee1 = EmployeeInfo("Sean Widdowson",22135,1)
    var employee2 = EmployeeInfo("Jason", 22136,2)
    var employee3 = EmployeeInfo("Freddie", 221337, 3)
    employee1.printAll()
    employee2.printAll()
    employee3.printAll()
    employee2.name = "Jeepers"
    employee3.shift = 1
    employee1.printAll()
    employee2.printAll()
    employee3.printAll()
}