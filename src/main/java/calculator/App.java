package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        char ch1 = sc.next().charAt(0);

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();


        int result = 0;
        if(ch1=='+') {
            result = num1 + num2;
        }else if(ch1=='-'){
            result = num1 - num2;
        }else if(ch1=='*'){
            result = num1 * num2;
        }else if(ch1=='/'){
            result = num1 / num2;
        }


        System.out.println("결과 : " + result);

        sc.nextLine();

        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
        String exit = sc.nextLine();
        if(exit.equals("exit")){
            break;
        }


    }
    }
}
