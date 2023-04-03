package ex08;
import java.util.*;

public class hw_2 {
    public static String lower(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        String result = lower(str);

        System.out.println(result);

        sc.close();
    }
}
