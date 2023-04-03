package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 : ");
        int num1=scanner.nextInt();
        System.out.print("num2 : ");
        int num2=scanner.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("두 수 중 큰 값: " + max);
    }
}
