package example;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("🔢 Введіть початок діапазону:");


        int start = scanner.nextInt();


        System.out.println("🔢 Введіть кінець діапазону:");


        int end = scanner.nextInt();


        System.out.println("👉 Введіть цифру від 1 до 9:");


        int digit = scanner.nextInt();


        if (digit < 1 || digit > 9) {


            System.out.println("❌ Помилка! Цифра повинна бути від 1 до 9.");


            scanner.close();


            return;


        }


        System.out.println("✅ Числа, які не діляться на " + digit + ":");


        int i;


        for (i = start; i <= end; i++) {


            if (i % digit == 0) {


                continue;


            }


            System.out.println("➡️ " + i);


        }


        scanner.close();


    }
}