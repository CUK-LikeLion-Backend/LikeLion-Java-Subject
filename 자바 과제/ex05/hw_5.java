package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("num1: ");
        int num1= s.nextInt();
        System.out.print("num2: ");
        int num2= s.nextInt();

        int num3 = (num1 > num2) ? num1 : num2;

        System.out.println("두 수 중 더 큰 값은 " + num3 + "입니다.");

    }
}
