package Java_Lession_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        System.out.println("1. Add number in List");
        System.out.println("2. Print numbers");
        System.out.println("3. Get max number");
        System.out.println("4. Get min number");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choose Option in list: ");
        int option = keyboard.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        switch (option) {
            case 1:
                inputNumber(keyboard, arrayList);
                break;
            case 2:
                inputNumber(keyboard, arrayList);
                System.out.println("The numbers you input: " + arrayList);
                break;
            case 3:
                inputNumber(keyboard, arrayList);
                System.out.println("The largest number you input:" + Collections.max(arrayList));

            case 4:
                inputNumber(keyboard, arrayList);
                System.out.println("The smallest number you input:" + Collections.min(arrayList));
                break;
            default:
                System.out.println("The case you selected is not in the list. Please choose again!");
                break;
        }
    }

    public static void inputNumber(Scanner keyboard, ArrayList<Integer> arrayList) {
        System.out.print("How many numbers you want to input: ");
        int numbers = keyboard.nextInt();
        for (int i = 0; i < numbers; i++) {
            System.out.print("Input your number:  ");
            int number = keyboard.nextInt();
            arrayList.add(number);
        }
    }
}