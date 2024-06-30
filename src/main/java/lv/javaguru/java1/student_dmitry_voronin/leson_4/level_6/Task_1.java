package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_6;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month number : ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber){
            case 3: case 4: case 5:{
                System.out.println("Spring");
                break;
            }
            case 6: case 7: case 8:{
                System.out.println("Summer");
                break;
            }
            case  9: case 10: case 11:{
                System.out.println("Autum");
                break;
            }
            case 12: case 1: case 2:{
                System.out.println("Winter");
                break;
            }
        }
    }
}
