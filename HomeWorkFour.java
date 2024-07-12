package HomeWorkfour;

import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 0 to 10:");
        int num = scanner.nextInt();
        String infoString = GetInfoString(num);
        System.out.println(infoString);
    }

    public static String GetInfoString(int num) {
        int m = 10;
        double n = 10.25;

        if (num == 10) {
            return "Number is 10";
        } else if (num < 10) {
            return "Number smaller than 10";
        } else {
            return "Number greater than 10";
        }
    }
}
















