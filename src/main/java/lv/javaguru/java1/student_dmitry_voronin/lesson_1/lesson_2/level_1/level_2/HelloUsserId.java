package lv.javaguru.java1.student_dmitry_voronin.lesson_1.lesson_2.level_1.level_2;

import java.util.Scanner;

public class HelloUsserId {
    public static void main(String[] args) {
        Scanner UsserId =  new Scanner(System.in);
        System.out.println("Enter ussername");

        String userName = UsserId.nextLine();
        System.out.println("Hello " + userName);


    }
}
