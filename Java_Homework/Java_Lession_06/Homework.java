package Java_Lession_06;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // 6.1
        String myTime = "2hours and 5 minutes";
        String[] myTimeArr = myTime.split("and");
        int hour = Integer.parseInt(myTimeArr[0].substring(0, myTimeArr[0].indexOf("hours")).trim());
        int minute = Integer.parseInt(myTimeArr[1].substring(0, myTimeArr[1].indexOf("minutes")).trim());
        System.out.println("Total minutes is: " + (hour*60 + minute));

        // 6.2:
        Scanner scannerInputPass = new Scanner(System.in);
        int correctTime = 0;
        String myPassword = "password12345";
        String password;
        while (correctTime < 3){
            System.out.print("Input your password: ");
            password = scannerInputPass.nextLine();
            if(password.equals(myPassword)){
                System.out.println("You input correct password");
                break;
            }
            else{
                correctTime++;
                System.out.println("Please input password again. Your have " + (3-correctTime) + " times remain");
            }
        }

        // 6.3
        System.out.print("Input your string: ");
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        for(char c : originalString.toCharArray()){
            if (!Character.isDigit(c)){
                originalString = originalString.replace(String.valueOf(c),"");
            }
        }
        System.out.println("The number string: " + originalString);

        // 6.4
        String url = "https://www.youtube.com/";
        System.out.println("The method: " + url.split(":")[0]);
        System.out.println("Domain: " + url.split("\\.")[url.split("\\.").length-1]);

    }
}