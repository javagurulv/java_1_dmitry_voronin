package lv.javaguru.java1.student_dmitry_voronin.lesson_5.levle_6;


class StudentGradeCard {

    private int mathGrade;

    private int englishGrade;

    private int sportGrade;

    private int chemicalGrade;

    public StudentGradeCard(int mathGrade,int englishGrade,int sportGrade,int chemicalGrade){
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.chemicalGrade = chemicalGrade;
        this.sportGrade =sportGrade;
    }

    public int getChemicalGrade() {
        return chemicalGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getSportGrade() {
        return sportGrade;
    }
}
