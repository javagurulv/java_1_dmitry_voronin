package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_1;

import java.util.Scanner;

public class Task_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :  ");
        int number = scanner.nextInt();

        if ((number % 2) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
