package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_1.task_1;

public class FizzBuzz {

    private static boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

    private static boolean isDividedBy5(int number) {
        return number % 5 == 0;
    }

    public String detect(int number) {
        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";
        } else if (isDividedBy5(number)) {
            return "Buzz";
        } else if (isDividedBy3(number)) {
            return "Fizz";
        } else {
            return "" + number;
        }
    }
}
