package ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        num2 = sc1.nextInt();

        System.out.println((num1 > num2 ) ? num1 : num2 );
    }
}
