package example;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");

        String input = scanner.nextLine();

        StringBuilder text = new StringBuilder(input);

        int count = 0;
        int i = 0;

        while (i < text.length()) {
            i++;
        }

        if (text.length() > 0) {
            i = 0;

            do {
                char symbol = text.charAt(i);

                if (symbol == '.' || symbol == '!' || symbol == '?') {
                    count++;
                }

                i++;
            } while (i < text.length());
        }

        System.out.println("Кількість речень: " + count);

        scanner.close();
    }
}