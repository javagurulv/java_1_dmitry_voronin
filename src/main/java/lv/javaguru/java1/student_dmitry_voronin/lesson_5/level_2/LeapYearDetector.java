package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_2;

 class LeapYearDetector {

    public boolean isLeapYear(int number){
        boolean isLeapYear = false;
        if (number % 4 == 0){
            if (number % 100 != 0) {
                isLeapYear = true;
            } else if (number % 400 == 0) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
