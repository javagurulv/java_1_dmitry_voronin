package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_2.task_3;

public class Car {

    private String name;
    private String color;

    private int cost;

    public Car(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;


    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    public String getColor(){
        return color;
    }
}

