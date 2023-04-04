package ex08;

import java.util.Scanner;
public class hw_4 {
    public static int ChangetoInteger (String user) {
        int it = Integer.parseInt(user);
        return it;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String user = scanner.next();
        System.out.print(ChangetoInteger(user));
    }
}
