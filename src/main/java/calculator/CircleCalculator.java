package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {

    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int radius){
        return PI * radius * radius;
    }


    @Override
    public void inquiryResults() {
        for (Double circleResult : super.getResults()) {
            System.out.println("원의 넓이 = " + circleResult);

        }
    }
}
