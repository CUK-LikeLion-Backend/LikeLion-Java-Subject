package ex08;

import java.util.Scanner;

public class hw_5 {
    public static String intToString(int num) {
        return Integer.toString(num);//정수를 문자형으로 형변환
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type string");
        int input = scanner.nextInt();
        String result = intToString(input);
        System.out.println(result);
    }
}
