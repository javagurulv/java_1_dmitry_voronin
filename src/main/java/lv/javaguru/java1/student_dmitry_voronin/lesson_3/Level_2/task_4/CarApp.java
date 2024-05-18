package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_2.task_4;

;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Yellow", 4000);
        Car car2 = new Car("BMW", "Black", 5000);
        Car car3 = new Car("Lada", "Red", 2000);

        System.out.println("Car1 name " + car1.getName() + " Color: " + car1.getColor() + " Cost " + car1.getCost());
        System.out.println("Car2 name " + car2.getName() + " Color: " + car2.getColor() + " Cost " + car2.getCost());
        System.out.println("Car3 name " + car3.getName() + " Color: " + car3.getColor() + " Cost " + car3.getCost());

        car1.setName("Mersedes");
        car1.setColor("Orane");
        car1.setCost(3500);

        car2.setName("Volga");
        car2.setColor("Pink");
        car2.setCost(4500);

        car3.setName("Volvo");
        car3.setColor("Grey");
        car3.setCost(4000);

        System.out.println("Car1 name " + car1.getName() + " Color: " + car1.getColor() + " Cost " + car1.getCost());
        System.out.println("Car2 name " + car2.getName() + " Color: " + car2.getColor() + " Cost " + car2.getCost());
        System.out.println("Car3 name " + car3.getName() + " Color: " + car3.getColor() + " Cost " + car3.getCost());


    }
}