package lv.javaguru.java1.student_dmitry_voronin.lesson_3.level_7_senior;

public class SoundBar {
    String model;
    boolean isOn;

    int volume;

    public SoundBar(String model){
        this.isOn = false;

        this.model = model;
    }
    String getModel(){
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
    public boolean isOff(){
        return !isOn;
    }
    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
        this.volume = 0;
    }
    void increaseVolume() {
        this.volume = volume + 1;
    }
}

//уровень звука (от 0 до 10)
//и свойство описывающее включена она или нет.
//
//Сделать так, чтобы объект музыкальную колонку
//можно было создать только
//с указанием модели и в выключенном
//состоянии (при этом уровень звука = 0).
//
//Научить музыкальную колонку включаться.
//
//Научить музыкальную колонку увеличивать уровень звука на 1,
//эта операция выполняется только если музыкальная колонка включена.
//
//Научить музыкальную колонку выключаться, при этом уровень звука
//сбрасывается на 0.
//
//Научить музыкальную колонку возвращать уровень звука,
//включена она или нет и ее модель (создайте get() методы для
//всех свойств музыкальной колонки).