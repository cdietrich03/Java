package week4;

public class Employee {


    public Employee doSomething(Employee employee) {
        return employee;
    }
    public void fun() {
        Employee myEmployee = new Employee();
        Employee employee = myEmployee.doSomething(myEmployee);
    }
}
