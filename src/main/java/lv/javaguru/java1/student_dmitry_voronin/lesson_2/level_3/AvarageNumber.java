package lv.javaguru.java1.student_dmitry_voronin.lesson_2.level_3;

import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter  second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter  third number: ");
        int number3 = scanner.nextInt();

        double midresult = number1 + number2 +  number3;
        double result = midresult /3;
        System.out.println(result);
    }
}
//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
//
//Примечание: обратите внимание, что результат может быть дробным числом.