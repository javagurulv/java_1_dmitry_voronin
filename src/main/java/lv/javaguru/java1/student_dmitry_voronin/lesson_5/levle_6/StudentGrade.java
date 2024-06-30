package lv.javaguru.java1.student_dmitry_voronin.lesson_5.levle_6;

class StudentGrade {

    public double calculate(StudentGradeCard reportCard){
        int gradeSum = reportCard.getChemicalGrade() + reportCard.getEnglishGrade() +
                reportCard.getMathGrade() + reportCard.getSportGrade();
        return gradeSum / (double) 4;

    }
}
