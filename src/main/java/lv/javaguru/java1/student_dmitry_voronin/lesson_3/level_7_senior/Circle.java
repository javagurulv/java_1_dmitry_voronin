package lv.javaguru.java1.student_dmitry_voronin.lesson_3.level_7_senior;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
//Разработать класс - круг, у которого должны быть следующие характеристики:
//Свойства: радиус (double radius),
//Методы: расчет площади (double calculateArea()).