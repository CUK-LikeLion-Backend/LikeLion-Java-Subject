package ex05;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("num :");
        num = sc.nextInt();

        if(num == 0) System.out.println("0입니다.");
        else if(num > 0) System.out.println("양수입니다.");
        else System.out.println("음수입니다.");
    }
}
