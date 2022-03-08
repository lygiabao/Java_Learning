package Java_Lession_05;

import java.util.*;

public class Homework {
    public static void main(String[] args) {

        Map<Integer, String> studentInfo = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("1. Input information of student ");
            System.out.println("2. Find Student by ID ");
            System.out.println("0. Exit ");
            System.out.println("Enter number option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Student ID: ");
                    int id = scanner.nextInt();
                    studentInfo.put(id, name);
                    break;
                case 2:
                    if (studentInfo.isEmpty()) {
                        System.out.print("Student info is empty.");
                    } else {
                        System.out.print("Enter student ID: ");
                        int idInput = scanner.nextInt();
                        System.out.println("Student Name: " + studentInfo.get(idInput));
                    }
                    break;
                case 3:
                    isContinue = false;
                    break;
                default:
                    System.out.println("1. Input student info");
                    System.out.println("2. Find Student by ID");
                    System.out.println("0. Exit!");
            }
        }
    }
}
