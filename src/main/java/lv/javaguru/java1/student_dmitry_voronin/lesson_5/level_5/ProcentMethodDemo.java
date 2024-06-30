package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_5;

public class ProcentMethodDemo {

    public static void main(String[] args) {
        ProcentMethodFormula procentMethodFormula = new ProcentMethodFormula();
        System.out.println("Teacher = 1200.0 " +
                "ratePerYear = 0,03 " +
                "yearsInvested = 12" +
                procentMethodFormula.calculate(1200,0.02,12));
        System.out.println("Teacher = 1200.0 " +
                "ratePerYear = 0,06 " +
                "yearsInvested = 12" +
                procentMethodFormula.calculate(1200,0.06,12));
        System.out.println("Teacher = 1200.0 " +
                "ratePerYear = 0,1 " +
                "yearsInvested = 12" +
                procentMethodFormula.calculate(1200,0.1,12));
    }
}
