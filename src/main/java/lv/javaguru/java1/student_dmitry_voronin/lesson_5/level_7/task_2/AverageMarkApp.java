package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int studentCount = getStudentCount(scanner);
        String[] students = getStudentNames(scanner, studentCount);
        double[] grades = getStudentGrades(scanner, studentCount, students);

        double average = calculateAverageStudentGrade(studentCount, grades);
        System.out.println("Средний балл: " + average);


        System.out.println("Программа завершена.");
    }

    private static int getStudentCount(Scanner scanner) {
        System.out.println("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());

    }

    private static double calculateAverageStudentGrade(int studentCount, double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / studentCount;

    }

    private static double[] getStudentGrades(Scanner scanner, int studentCount, String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;

    }

    private static String[] getStudentNames(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];


        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;

    }
}