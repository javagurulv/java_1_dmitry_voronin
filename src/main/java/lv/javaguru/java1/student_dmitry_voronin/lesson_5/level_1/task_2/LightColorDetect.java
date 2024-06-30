package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_1.task_2;

public class LightColorDetect {


    public String detect(int wavelenght) {
        String light = "";
        if (wavelenght >= 380 && wavelenght <= 449) {
            light = "Violet";
        } else if (wavelenght >= 450 && wavelenght <= 494){
            light = "Blues";
        } else if (wavelenght >= 495 && wavelenght <= 569) {
            light = "Green";
        } else if (wavelenght >= 570 && wavelenght <=589) {
            light = "Yellow";
        } else if (wavelenght >= 590 && wavelenght <= 619){
            light = "Orange";
        } else if (wavelenght >= 620 && wavelenght <= 750){
            light = "Red";
        }else{
            light = "Invisible Light";
        }
        return light;
    }
}
