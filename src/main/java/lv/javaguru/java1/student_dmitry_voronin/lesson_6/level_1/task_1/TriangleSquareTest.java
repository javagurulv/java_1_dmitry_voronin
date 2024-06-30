package lv.javaguru.java1.student_dmitry_voronin.lesson_6.level_1.task_1;

public class TriangleSquareTest {

    public static void main(String[] args) {

        TriangleSquareTest test = new TriangleSquareTest();
        test.shouldCalculateSemiPerimeter();
        test.shouldCalculateSquare();
    }
    public void shouldCalculateSemiPerimeter(){
        TriangleSquare triangleSquare = new TriangleSquare();
        double semiPerimeter = triangleSquare.calculateSemiPerimeter(5,4,5);
        checkResult(semiPerimeter,7,"shouldcalculateSemiPerimeter");
    }

    public void  shouldCalculateSquare(){
        TriangleSquare triangleSquare = new TriangleSquare();
        double square = triangleSquare.calculateSemiPerimeter(5,4,5);
        checkResult(square,7,"shouldcalculateSemiPerimeter");

    }
    private void checkResult(double realResult,double expectedResult,String testScenarioName){
        double treshold = 0.00001d;
        if(Math.abs(realResult - expectedResult) < treshold){
            System.out.println(testScenarioName + " : Test pass ");
        }else{
            System.out.println(testScenarioName + " : Test fail!  expected  = " + expectedResult + " real result = " + realResult );
        }
    }
}
