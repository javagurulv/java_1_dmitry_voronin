package lv.javaguru.java1.student_dmitry_voronin.lesson_5.level_7.task_1;

 class TemperatureConverterDemo {

     public static void main(String[] args) {
         TemperatureConverter converter = new TemperatureConverter();
         System.out.println("Celsius 27,fahrenheit = " + converter.convertCelsiusToFahrenheit(28));

         System.out.println("Fahrenheit 70,celsius = " + converter.convertFahrenheitToCelsius(70));
     }

}
