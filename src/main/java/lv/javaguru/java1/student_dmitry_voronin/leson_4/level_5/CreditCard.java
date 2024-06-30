package lv.javaguru.java1.student_dmitry_voronin.leson_4.level_5;

import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cash sum ");
        int cashSum = scanner.nextInt();

        double commission = 0.0;
        if(cashSum < 1000){
            commission = (double) cashSum / 100 * 3;
        }

        if(cashSum >= 1000 && cashSum < 5000){
            commission = (double) cashSum / 100 *4;
        }

        if(cashSum >= 5000){
            commission = (double) cashSum / 100 * 5;
        }

        System.out.println("Commission : " + commission);
    }
}
