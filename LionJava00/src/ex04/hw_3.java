package ex04;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 15;
        int num2 = 8 ;
        if((num1 % 3)== 0 ){
            System.out.println("num1 나머지 연산의 결과는 0입니다.");
        }
        else {
            System.out.println("num1 나머지 연산의 결과는 0이 아닙니다.");
        }
        if((num2 % 4)== 0 ){
            System.out.println("num2 나머지 연산의 결과는 0입니다.");
        }
        else {
            System.out.println("num2 나머지 연산의 결과는 0이 아닙니다.");
        }
    }

}
