package calculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


    List<Integer> results = new ArrayList<>();

    public int Calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
              if(num2 != 0) {
                 result = num1 / num2;
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

}
