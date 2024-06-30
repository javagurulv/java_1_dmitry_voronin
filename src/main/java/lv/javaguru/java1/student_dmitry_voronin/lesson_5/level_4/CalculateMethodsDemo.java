package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_4;

public class CalculateMethodsDemo {

    public static void main(String[] args) {
        CircleMethods circleMethods = new CircleMethods();
        System.out.println("Area (R = 2.5) = " + circleMethods.calculateArea(2.5));
        System.out.println("Area (R = 3.2) = " + circleMethods.calculateArea(3.2));
        System.out.println("Area (R = 4.0) = " + circleMethods.calculateArea(4.0));

        System.out.println("Perimeter (R = 2.5) = " + circleMethods.calculatePerimeter(2.5));
        System.out.println("Perimeter (R = 3.2) = " + circleMethods.calculatePerimeter(3.2));
        System.out.println("Perimeter (R = 4.0) = " + circleMethods.calculatePerimeter(4.0));
    }
}
