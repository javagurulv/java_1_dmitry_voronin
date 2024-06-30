package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("numbers are equal");
        } else if (number1 != number2) {
            System.out.println("numbers are different");
        }
    }

}
