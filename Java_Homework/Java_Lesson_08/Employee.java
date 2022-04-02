package Java_Lesson_08;

import java.util.List;

public class Employee {
    String employeeName;
    int salary;

    public Employee(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    protected static int totalSalary(List<Employee> employeeList) {
        int total = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            total += employeeList.get(i).salary;
        }
        return total;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
