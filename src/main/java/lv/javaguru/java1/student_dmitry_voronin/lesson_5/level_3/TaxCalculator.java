package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {


    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal tax = BigDecimal.ZERO;

        if (income.compareTo(new BigDecimal(1000)) < 0) {
            tax = income.multiply(new BigDecimal(0.30))
                    .setScale(2, RoundingMode.HALF_UP);
        }
        return tax;
    }
}






