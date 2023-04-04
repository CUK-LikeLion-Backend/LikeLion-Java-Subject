package ex05;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if(num>0) {
            System.out.println("양수입니다.");
        } else if (num==0) {
            System.out.println("0 입니다.");
        } else if (num<0) {
            System.out.println("음수입니다.");
        }
    }
}
