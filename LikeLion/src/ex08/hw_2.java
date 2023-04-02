package ex08;

import java.util.Scanner;

public class hw_2 {
    public static String Low(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. ");
        String str = scanner.next();
        System.out.println(Low(str));


    }
}