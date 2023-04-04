package ex08;

import java.util.Scanner;

// 정수를 문자열로 바꾸는 함수
public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");

        int num = sc.nextInt();
        String str = Integer.toString(num);
        System.out.println("변환된 값: " + num);

    }
}
