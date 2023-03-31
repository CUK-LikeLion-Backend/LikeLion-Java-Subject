package ex08;
import java.util.*;

public class hw_4 {
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        int result = stringToInt(str);

        System.out.println("문자열을 정수로 변환한 결과 : " + result);

        sc.close();
    }
}
