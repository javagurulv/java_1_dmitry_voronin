package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_2;

public class LeapYearDemo {

    public static void main(String[] args) {
        LeapYearDetector leapYearDetector = new LeapYearDetector();
        System.out.println("2000 = " + leapYearDetector.isLeapYear(2000));
        System.out.println("2001 = " + leapYearDetector.isLeapYear(2001));
        System.out.println("1500 = " + leapYearDetector.isLeapYear(1500));
        System.out.println("2024 = " + leapYearDetector.isLeapYear(2024));
    }
}
