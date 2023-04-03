package ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("숫자를 입력하시오: ");
        int sip = scanner.nextInt();

        String binary = Integer.toBinaryString(sip); //10진수를 2진수로 표현해주는 메소드
        System.out.println("2진수 : " + binary);
    }
}
