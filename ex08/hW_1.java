package ex08;

import java.util.Scanner;

public class hW_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("영어 문자열을 입력하시오: ");

        String str=scanner.nextLine();
        str=str.toUpperCase();
        System.out.println(str);
    }
}