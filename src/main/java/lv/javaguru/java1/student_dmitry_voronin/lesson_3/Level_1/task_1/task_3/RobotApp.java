package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_1.task_1.task_3;


public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Vaflja");
        Robot robot2 = new Robot("Urij");
        System.out.println("Name Robot1 " + robot1 + "Name Robot2 " + robot2);

        System.out.println("Name Robot1 " + robot1.getName());
        System.out.println("Name Robot2 " + robot2.getName());

    }
}