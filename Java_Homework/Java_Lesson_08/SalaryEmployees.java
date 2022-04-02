package Java_Lesson_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaryEmployees extends Employee {
    public SalaryEmployees(String employeeName, int salary) {
        super(employeeName, salary);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        ContractEmployee contractEmployee = new ContractEmployee();
        FulltimeEmployee fullTimeEmployee = new FulltimeEmployee();
        Scanner keyboard = new Scanner(System.in);
        EnterEmployees(keyboard, employeeList, contractEmployee.type,contractEmployee.salary, fullTimeEmployee.type, fullTimeEmployee.salary);
        System.out.println(employeeList);
        System.out.println("Total salary: " + totalSalary(employeeList));
    }

    private static void EnterEmployees(Scanner keyboard, List<Employee> employeeList, String contractEmployeeType, int contractEmployeeSalary, String fullTimeEmployeeType, int fullTimeEmployeeSalary){
        System.out.print("How many employees do you want to enter?:");
        int numbers = keyboard.nextInt();
        for (int i = 0; i < numbers; i++) {
            System.out.print("Employee name: ");
            String employeeName = keyboard.next();
            System.out.print("Enter employee type: F (full-time) / C (contract): ");
            String type = keyboard.next();
            if (type.equals(fullTimeEmployeeType)) {
                Employee employee = new Employee(employeeName, fullTimeEmployeeSalary);
                employeeList.add(employee);
            }else if (type.equals(contractEmployeeType)){
                Employee employee = new Employee(employeeName, contractEmployeeSalary);
                employeeList.add(employee);
            } else {
                System.out.println("Employee type doesn't exist!");
                break;
            }
        }
    }
}

