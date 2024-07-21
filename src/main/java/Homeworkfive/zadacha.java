package Homeworkfive;

import java.util.Scanner;

public class zadacha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье целое число");
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
            System.out.println("Максимальное число" + max);
        }
    }
}
