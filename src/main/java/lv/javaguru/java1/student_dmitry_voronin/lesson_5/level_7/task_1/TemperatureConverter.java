package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_7.task_1;

 class TemperatureConverter {

    public double convertCelsiusToFahrenheit(double celsius){
        return celsius *9/5 + 32;
    }
    public double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit -32) /1.8;
    }
}
