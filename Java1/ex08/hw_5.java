package ex08;

import java.util.Scanner;

public class hw_5 {
    public static String ChangetoString (int user) {
        String str = Integer.toString(user);
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int user = scanner.nextInt();
        System.out.print(ChangetoString(user));
    }
}
