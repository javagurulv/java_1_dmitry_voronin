package lv.javaguru.java1.student_dmitry_voronin.lesson_5.levle_6;

class StudentGradeDemo {

    public static void main(String[] args) {

        StudentGrade studentGrade = new StudentGrade();
        StudentGradeCard reportCard1 = new StudentGradeCard(6,8,10,5);

        System.out.println("Average grade = " + studentGrade.calculate(reportCard1));

        StudentGradeCard reportCard2 = new StudentGradeCard(5,6,8,8);
        System.out.println("Avarage grade = " + studentGrade.calculate(reportCard2));
    }

}
