package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number of day form (1-7) :  ");

        int dayNumber = scanner.nextInt();

        if(dayNumber == 1){
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Thuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wedneday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Don't match! Please enter numbers from 1 to 7. ");
        }

    }

}
