package ru.gertru;

import java.util.Scanner;

public class MyProgramTask1 {

    public static void main(String[] args) {

        Card myCard = new Card("2222 3333 4444 5555", "12/26", "012", "0000");
        System.out.println(myCard.getPrivateNumber());
        System.out.println("Введите пин-код:");
        myCard.getTrueNumber((new Scanner(System.in)).nextLine());

    }
}
