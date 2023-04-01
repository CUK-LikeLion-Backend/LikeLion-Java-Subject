package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        int num1, num2;
        int result;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        result = (num1>num2)?num1:num2;

        System.out.println("큰 값 = " + result);
    }
}
