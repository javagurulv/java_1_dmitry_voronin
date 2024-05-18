package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_3.task_5;

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
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDiagnosis(){
        return diagnosis;
    }

    public int getCost() {
        return cost;
    }
}

