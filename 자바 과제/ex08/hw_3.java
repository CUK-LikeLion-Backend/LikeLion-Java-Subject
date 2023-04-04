package ex08;

import java.util.Scanner;

public class hw_3 {
    public static String Change(String s) {
        if (s == "z") {
            return "a";
        } else if (s == "Z") {
            return "A";
        } else {
            return (String) (s + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        System.out.print("변환된 문자열: ");

        System.out.println(Change(s));

    }
}