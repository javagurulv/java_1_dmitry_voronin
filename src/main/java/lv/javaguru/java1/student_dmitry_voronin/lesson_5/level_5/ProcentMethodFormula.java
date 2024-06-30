package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_5;

public class ProcentMethodFormula {

    public double calculate(double ratePerYear,double amount, int yearsInvested){
        return amount * Math.pow((1 + ratePerYear), yearsInvested);
    }
}
