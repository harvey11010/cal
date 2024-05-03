package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator{
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(List<Double> results, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator) {

        super(results);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    public double Calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                if(num2 != 0) {
                    result = divideOperator.operate(num1, num2);
                }else{
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }

                break;
            default:
                System.out.println("올바른 선택이 아닙니다.");
                throw new UnsupportedOperationException("올바른 선택이 아닙니다.");
        }
        return result;
    }
    @Override
    public void inquiryResults() {
        for (Double result : super.getResults()) {
            System.out.println("연산 결과 = " + result);
        }
    }


}
