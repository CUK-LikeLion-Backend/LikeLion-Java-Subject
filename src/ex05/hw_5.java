package ex05;

import java.util.Scanner;

//int형 변수 num1과 num2를 선언하고,
// 두 수 중 큰 값을 출력하는 프로그램을 작성하세요.
// 단, 조건문(if-else)을 사용하지 않고 삼항 연산자를 사용하여 작성하세요.
public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = (num1 >= num2) ? num1 : num2;
        System.out.println(result);
    }
}
