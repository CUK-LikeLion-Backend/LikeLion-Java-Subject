package ex08;

import java.util.Scanner;

public class hw_4 {
    public static int  trInt(String str) {
        int i = Integer.parseInt(str);
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. ");
        String str = scanner.next();
        System.out.println(trInt(str));

    }
}