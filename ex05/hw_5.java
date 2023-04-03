package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("두 정수를 입력하시오: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        int result=(num1>num2)?num1:num2;
        System.out.println(result);

    }
}
