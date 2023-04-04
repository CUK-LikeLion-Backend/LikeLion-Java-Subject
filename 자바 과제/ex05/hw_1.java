package ex05;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("나이를 입력하시오: ");
        int age = sc.nextInt(); // 자료형에 따라 값을 입력 받음.

        if(age>=20) System.out.println("성인입니다.");
    }
}
