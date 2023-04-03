package ex05;

import java.util.Scanner;

// int형 변수 num을 선언하고, 값이 양수인 경우 "양수입니다.", 음수인 경우 "음수입니다.",
// 0인 경우 "0입니다."라는 메시지를 출력하는 프로그램을 작성하세요.
public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수입니다");
        } else if (num < 0) {
            System.out.println("음수입니다");
        } else
            System.out.println("0입니다");
    }
}
