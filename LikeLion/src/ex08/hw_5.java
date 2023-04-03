package ex08;

import java.util.Scanner;

public class hw_5 {

    public static String  trStr(int i) {
        String str = String.valueOf(i);
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요. ");
        int i = scanner.nextInt();
        System.out.println(trStr(i));

    }

}