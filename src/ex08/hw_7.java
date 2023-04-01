package ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        //입력받은 숫자를 2진수 문자열로.
        String result = Integer.toBinaryString(input);
        System.out.println(result);
    }
}
