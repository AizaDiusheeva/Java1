package Homeworktree;

import java.util.Scanner;

public class Minus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input c: ");
        int c = scanner.nextInt();
        System.out.println("input d: ");
        int d = scanner.nextInt();
        int result = getMinus(c, d);
        System.out.println("sum c - d =" + result);

    }

    public static int getMinus(int c, int d) {
        return c - d;


    }
}
