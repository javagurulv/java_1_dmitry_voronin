package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_3.tak_4;

public class DoctorVisit {

    private String firstName;
    private String lastName;
    private String diagnosis;
    private int cost;

    public DoctorVisit(String firstName,String lastName, String diagnosis,int cost){
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }
}
//Создайте классы описывающие запись пациентов к врачу на один день.
//Врач каждый день делает только два приёма:
//- 10:00-12:00;
//- 14:00-16:00.
//
//Расписание врача на один день
//описывается следующими свойствами:
//- имя и фамилия врача;
//- специальность (зубной, ухо горло нос, ...);
//- дата приёма;
//- запись на приём 10:00-12:00;
//- запись на приём 14:00-16:00.
//
//Запись на приём - это объект у которого есть:
//- имя и фамилия пациента;
//- диагноз;
//- стоимость визита.
//
//У каждого класса должен быть конструктор,
//для задания начального значения всем свойствам класса.