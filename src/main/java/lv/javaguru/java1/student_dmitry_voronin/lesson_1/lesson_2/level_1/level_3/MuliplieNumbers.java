package lv.javaguru.java1.student_dmitry_voronin.lesson_1.lesson_2.level_1.level_3;

import java.util.Scanner;

public class MuliplieNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        int multiplier1 = number;
        int multiplier2 = number * 2;
        int multiplier3 = number * 3;
        int multiplier4 = number * 4;
        int multiplier5 = number * 5;
        int multiplier6 = number * 6;
        int multiplier7 = number * 7;
        int multiplier8 = number * 8;
        int multiplier9 = number * 9;
        int multiplier10 = number * 10;

        System.out.println(number + "* " + "1 " + "=" + multiplier1);
        System.out.println(number + "* " + "2 " + "=" + multiplier2);
        System.out.println(number + "* " + "3 " + "=" + multiplier3);
        System.out.println(number + "* " + "4 " + "=" + multiplier4);
        System.out.println(number + "* " + "5 " + "=" + multiplier5);
        System.out.println(number + "* " + "6 " + "=" + multiplier6);
        System.out.println(number + "* " + "7 " + "=" + multiplier7);
        System.out.println(number + "* " + "8 " + "=" + multiplier8);
        System.out.println(number + "* " + "9 " + "=" + multiplier9);
        System.out.println(number + "* " + "10 " + "=" + multiplier10);


    }

}
//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения.
//
//Test Data:
//Input a number: 8
//
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80