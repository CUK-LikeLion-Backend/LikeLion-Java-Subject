package ex05;

import java.util.Scanner;
// int형 변수 age를 선언하고,
// 값이 20 이상인 경우 "성인입니다."라는 메시지를 출력하는 프로그램을 작성하세요.
public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요:");
        int age = sc.nextInt();
        if(age>=20){
            System.out.println("성인입니다.");
        }

    }
}