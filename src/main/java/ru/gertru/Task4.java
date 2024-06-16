package ru.gertru;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        String password = (new Scanner(System.in)).nextLine();

        if (password.length() >= 8) {
            if (hasSpecNumber(password)) {
                if (hasSpecSymbol(password)) {
                    System.out.println("Пароль принят!");
                } else {
                    System.out.println("Пароль должен содержать минимум 1 спецсимвол");
                }
            } else {
                System.out.println("Пароль должен содержать минимум 1 цифру");
            }
        } else {
            System.out.println("Пароль не менее 8 символов");
        }
    }

    private static boolean hasSpecSymbol(String pass) {
        boolean result = false;
        String[] specSymbols = {"!", "@", "#", "$", "%", "^", "&", "*", "№"};
        for (String symbol : specSymbols) {
            if (pass.contains(symbol)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean hasSpecNumber(String pass) {
        boolean result = false;
        String[] specNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String number : specNumbers) {
            if (pass.contains(number)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
