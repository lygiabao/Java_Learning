package Java_Lesson_03;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int countOddNumber = 0;
        int countEvenNumber = 0;
        int temp = array[0];

        for (int i = 0; i < n; i++) {
            System.out.println("Input number of elements in array: ");
            array[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++) {
            if(array[i] % 2 == 0) {
                countEvenNumber++;
            } else{
                countOddNumber++;
            }
        }
        System.out.println("Count even number in array is: " + countEvenNumber);
        System.out.println("Count even number in array is: " + countOddNumber);

        int max = array[0];
        for (int i:array){
            if(max < i){
                max = i;
            }
        }
        System.out.println("The highest number in array is: " + max);

        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
