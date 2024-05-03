package calculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    public static final double PI = 3.14;

    private final List<Double> results;

    public Calculator(List<Double> results) {
        this.results = results;
    }
    //원의 넓이를 구하는 메서드


    public void removeResult(int index){
        this.results.remove(index);
    }

    abstract void inquiryResults();

    public List<Double> getResults() {
        return results;
    }

}
