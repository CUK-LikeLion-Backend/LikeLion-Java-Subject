package ex08;

import java.util.Scanner;

public class hw_4 {
    public static int stringToInt(String str) {

        return Integer.parseInt(str);//문자열 정수로 형변환
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type string");
        String input = scanner.nextLine();
        int result = stringToInt(input);
        System.out.println(result);
    }
}
