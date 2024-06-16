package ru.gertru;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int example = (new Scanner(System.in)).nextInt();
        if (example % 2 == 0) {
            System.out.println("Четное число.");
        } else {
            System.out.println("Нечетное число.");
        }
    }
}
