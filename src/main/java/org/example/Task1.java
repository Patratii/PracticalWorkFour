package example;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть першу сторону трикутника: ");


        double a = scanner.nextDouble();


        System.out.print("Введіть другу сторону трикутника: ");


        double b = scanner.nextDouble();


        System.out.print("Введіть третю сторону трикутника: ");


        double c = scanner.nextDouble();


        if (a <= 0 || b <= 0 || c <= 0) {


            System.out.println("Трикутник не може існувати.");


        } else if (a + b <= c || a + c <= b || b + c <= a) {


            System.out.println("Трикутник не може існувати.");


        } else if (a == b && b == c) {


            System.out.println("Трикутник рівносторонній.");


        } else if (a == b || a == c || b == c) {


            System.out.println("Трикутник рівнобедрений.");


        } else {


            System.out.println("Трикутник різносторонній.");


        }


        scanner.close();


    }
}