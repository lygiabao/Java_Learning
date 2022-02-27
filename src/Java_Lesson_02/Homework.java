package Java_Lesson_02;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight: ");
        float yourWeight = scanner.nextFloat();
        System.out.println("Input your height: ");
        float yourHeight = scanner.nextFloat();
        float BMI = yourWeight/(yourHeight*2)*100;
        System.out.println("BMI is: " + BMI);

        if(BMI < 18.5){
            System.out.println("You are underweight");
        } else if(BMI < 24.9){
            System.out.println("You are nomrmal weight");
        } else if(BMI < 29.9){
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity");
        }

        System.out.println("Input number: ");
        int numberInput = scanner.nextInt();
        int numberCount = numberInput/2;
        if(numberCount == 1){
            System.out.println("This is odd number");
        } else {
            System.out.println("This is even number");
        }
    }
}
