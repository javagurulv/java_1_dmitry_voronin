package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_1.task_1;

import lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_1.task_1.FizzBuzz;

public class FizzBuzzDemo {

    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("Number 5 = " + fizzBuzz.detect(5));
        System.out.println("Number 6 = " + fizzBuzz.detect(6));
        System.out.println("Number 15 = " + fizzBuzz.detect(15));
        System.out.println("Number 5 = " + fizzBuzz.detect(10));
        System.out.println("Number 9 = " + fizzBuzz.detect(9));
        System.out.println("Number 30 = " + fizzBuzz.detect(30));

    }
}
