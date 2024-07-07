package Homeworktree;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        int a = scanner.nextInt();
        System.out.println("input b: ");
        int b = scanner.nextInt();
        int result = getsum(a, b);
        System.out.println("sum  a * b =" + result);

    }

    public static int getsum(int a, int b) {

        return a * b;
}
}





