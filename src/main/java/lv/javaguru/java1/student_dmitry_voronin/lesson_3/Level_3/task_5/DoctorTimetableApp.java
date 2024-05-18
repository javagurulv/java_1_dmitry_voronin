package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_3.task_5;

public class DoctorTimetableApp {
    public static void main(String[] args) {
        DoctorVisit doctorVisit1 = new DoctorVisit("Jurijs", "Zarinjs", "teath", 50);
        DoctorVisit doctorVisit2 = new DoctorVisit("Aldis", "Krumins", "ear test", 25);


        DoctorTime doctorTime = new DoctorTime("Anna","Visotina","dentist","20.05.2024","10:00-12:00","14:00-16:00");

        System.out.println("Patient first name : " + doctorVisit1.getFirstName());
        System.out.println("Patient last name : " + doctorVisit1.getLastName());
        System.out.println("Diagnosis : " + doctorVisit1.getDiagnosis());
        System.out.println("Visit price : " +  doctorVisit1.getCost());

        System.out.println("Doctor first name : " + doctorTime.getDoctorFirstName());
        System.out.println("Doctor last name : "  + doctorTime.getDoctorLastName());
        System.out.println("Doctor specific : " + doctorTime.getDoctorSpeciality());
        System.out.println("Diagnosis : " + doctorTime.getDate());
        System.out.println("Doctor visit : " + doctorTime.getDoctorVisit1());
    }


}
