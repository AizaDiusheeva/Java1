package Homeworkfive;

import java.util.Scanner;

public class Isleap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int yaer = scanner.nextInt();
        boolean Isleap = false;
        if (yaer % 4 == 0) {
            if (yaer % 100 == 0) {
                if(yaer % 400 == 0)  {
                    Isleap = true;
                }
            } else {
                Isleap = true;
            }
            if (Isleap) {
                System.out.println(yaer + "Is a leap year");
            } else {
                System.out.println(yaer + "Is  not a  leap year ");
            }


        }
    }
}


