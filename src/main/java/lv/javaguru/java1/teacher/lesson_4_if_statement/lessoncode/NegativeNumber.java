package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NegativeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isNegative = number < 0;  // <, <=, >, >=, ==, !=

        System.out.println("Number is negative = " + isNegative);

    }

}
