package ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("영어 문자열을 입력하시오: ");

        String str=scanner.nextLine();
        str=str.toLowerCase();
        System.out.println(str);
    }
}
