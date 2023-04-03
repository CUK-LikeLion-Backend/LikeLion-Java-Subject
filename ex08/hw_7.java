package ex08;
import java.util.*;

public class hw_7 {
    public static String intToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int num = sc.nextInt();

        String result = intToBinary(num);

        System.out.println(num + "을(를) 이진수로 변환한 문자열 : " + result);

        sc.close();
    }
}
