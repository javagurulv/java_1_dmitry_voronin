package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_1.task_2;

public class LightColorDetectorDemo {

    public static void main(String[] args) {
        LightColorDetect detect = new LightColorDetect();
        System.out.println("400 = " + detect.detect(400));
        System.out.println("449 = " + detect.detect(449));
        System.out.println("480 = " + detect.detect(480));
        System.out.println("500 = " + detect.detect(500));
        System.out.println("550 = " + detect.detect(550));
        System.out.println("569 = " + detect.detect(569));
        System.out.println("600 = " + detect.detect(600));
        System.out.println("650 = " + detect.detect(650));
        System.out.println("750 = " + detect.detect(750));
        System.out.println("800 = " + detect.detect(800));
    }
}
