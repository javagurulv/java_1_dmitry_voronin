package lv.javaguru.java1.student_dmitry_voronin.lesson_3.level_7_senior;

public class SoundBarDemo {
    public static void main(String[] args) {

        SoundBar soundBar = new SoundBar("Sony");
        soundBar.turnOn();
        System.out.println("Soundbar name : " + soundBar.getModel());
        System.out.println("Volume: " + soundBar.getVolume());

        soundBar.increaseVolume();
        soundBar.increaseVolume();
        soundBar.increaseVolume();
        System.out.println("increased volume: " + soundBar.getVolume());

        soundBar.turnOff();

        System.out.println("Soundbar is: " + soundBar.getVolume());
        System.out.println("soundbar is on: " + soundBar.isOn());
        soundBar.turnOn();
        System.out.println("soundbar is on: " + soundBar.isOn());
        soundBar.increaseVolume();
        soundBar.increaseVolume();
        System.out.println("Soundbar is: " + soundBar.getVolume());


    }
}
