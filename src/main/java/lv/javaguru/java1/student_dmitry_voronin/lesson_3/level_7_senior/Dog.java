package lv.javaguru.java1.student_dmitry_voronin.lesson_3.level_7_senior;

public class Dog {
    String name;
    int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "My nickname is " + this.name;
    }
    public int happyBirthday(){
        return this.age = age+1;
    }


    public int getAge() {
        return age;
    }

}


//Научить виртуальную собаку "подавать голос" - при вызове этого
//метода собака должна возвращать фразу: "Создать класс описывающий собаку.
//У собаки должна быть кличка и возраст указанный в полных годах.
//
//Сделать так, чтобы объект собаку можно было создать только
//указав кличку и возраст.
//
//Научить виртуальную собаку "подавать голос" - при вызове этого
//метода собака должна возвращать фразу: "My nickname is " + кличка собаки.
//




