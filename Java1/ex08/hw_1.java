package ex08;
import java.util.Scanner;
public class hw_1 {
    public static String toUpper(String user) {
        return user.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String user = scanner.next();
        System.out.println(toUpper(user));
    }
}
