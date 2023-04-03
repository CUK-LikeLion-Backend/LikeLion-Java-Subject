package ex08;

import java.util.Scanner;

public class hw_1 {
    public static String Up(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. ");
        String str = scanner.next();
        System.out.println(Up(str));


    }

}