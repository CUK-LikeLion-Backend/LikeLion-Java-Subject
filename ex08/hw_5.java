package ex08;
import java.util.*;

public class hw_5 {
    public static String intToString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = sc.nextInt();

        String result = intToString(num);

        System.out.println("정수를 문자열로 변환한 결과 : " + result);

        sc.close();
    }
}
