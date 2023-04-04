package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int big = num1 > num2 ? num1 : num2;
        System.out.printf("%d", big);
    }
}
