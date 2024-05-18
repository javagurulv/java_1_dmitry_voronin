package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_2.task_4;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


