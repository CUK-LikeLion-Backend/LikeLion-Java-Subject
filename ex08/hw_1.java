package ex08;
import java.util.*;

public class hw_1 {
    public static String upper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        String result = upper(str);

        System.out.println(result);

        sc.close();
    }
}
