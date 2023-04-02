package ex08;

import java.util.Scanner;

public class hw_7 {

    public static  String toBinary(int num){
        String num2 = Integer.toBinaryString(num);
        return num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. ");
        int num = scanner.nextInt();
        String result = toBinary(num);
        System.out.println("2진수 : " + result);

    }
}