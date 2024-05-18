package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_3.task_5;

public class DoctorTime {
    private String doctorFirstName;
    private String doctorLastName;
    private String doctorSpeciality;
    private String date;
    private String doctorVisit1;
    private String doctorVisit2;

    public DoctorTime(String doctorFirstName, String doctorLastName, String doctorSpeciality,String date, String doctorVisit1, String doctorVisit2) {
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorVisit1 = doctorVisit1;
        this.doctorVisit2 = doctorVisit2;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public String getDate() {
        return date;
    }

    public String getDoctorVisit1() {
        return doctorVisit1;
    }

    public String getDoctorVisit2() {
        return doctorVisit2;
    }
}
