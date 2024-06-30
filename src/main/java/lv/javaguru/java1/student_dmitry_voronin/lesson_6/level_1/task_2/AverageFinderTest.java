package lv.javaguru.java1.student_dmitry_voronin.lesson_6.level_1.task_2;

public class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.shouldCalculateAverageWithRound();
        test.shouldCalculateAverage();

    }

    public void shouldCalculateAverage(){
        AverageFinder averageFinder = new AverageFinder();
        int average = averageFinder.findAverage(14,15);
        checkResult(average,14,"ShouldCalculateAverage");
    }

    private void shouldCalculateAverageWithRound(){
        AverageFinder averageFinder = new AverageFinder();
        int average = averageFinder.findAverage(14,15);
        checkResult(average,14,"ShouldCalculateAverage");
    }

    private void checkResult(int realResult,int expectedResult,String testScenarioName){
        if(realResult == expectedResult){
            System.out.println(testScenarioName + ": Test Pass! ");
        }else{
            System.out.println(testScenarioName + ": Test Fail! expected = " + expectedResult + "realResult : " + realResult);
        }
    }
}
