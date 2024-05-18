package lv.javaguru.java1.student_dmitry_voronin.lesson_1.lesson_2.level_1.level_3;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius: ");
        double radius = scanner.nextDouble();

        double preimeter =2* Math.PI * radius;
        double area = Math.PI*radius*radius;
        System.out.println("Perimeter is = " + preimeter);
        System.out.println("Area is = " + area);
    }

}
//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586