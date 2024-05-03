package calculator;

import java.util.Scanner;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(
                new ArrayList<>(),
                new AddOperator(),
                new SubtractOperator(),
                new MultiplyOperator(),
                new DivideOperator()
        );
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        do{
            System.out.println("어떤 계산을 하시겠습니까? (1: 사칙연산, 2: 원의 넓이)");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.println("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.println("사칙연산 기호를 입력하세요: ");
                char opearator = sc.next().charAt(0);

                double result = arithmeticCalculator.Calculate(num1, num2, opearator);
                arithmeticCalculator.getResults().add(result);


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if (Objects.equals(sc.next(), "remove")) {
                    arithmeticCalculator.getResults().remove(0);
                }
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (Objects.equals(sc.next(), "inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }
            }else{
                System.out.println("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();

                double area = circleCalculator.calculate(radius);
                circleCalculator.getResults().add(area);
                System.out.println("반지름이 " + radius + "인 원의 넓이는 : " + area);
                System.out.println("저장된 원의 넓이 전체 조회 : ");
                circleCalculator.inquiryResults();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
    } while (!sc.next().equals("exit"));
}
}