package ru.gertru;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int example = (new Scanner(System.in)).nextInt();
        if (example % 2 == 0) {
            System.out.print("Четное число.");
            if (example % 4 == 0)
                System.out.println(" Кратно четырем");
        } else {
            System.out.print("Нечетное число.");
            if (example % 3 == 0)
                System.out.println(" Кратно трем.");
        }
    }
}
