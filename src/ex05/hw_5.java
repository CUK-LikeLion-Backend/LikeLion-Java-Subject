package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        int num1,num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 입력: ");
        num1 = sc.nextInt();
        System.out.print("수2 입력: ");
        num2 = sc.nextInt();

        int max = (num1>num2)?num1:num2;

        System.out.println("max = " + max);
    }
}
