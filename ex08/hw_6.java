package ex08;
import java.util.*;

public class hw_6 {
    public static String[] splitString(String str) {
        String[] arr = str.split(" ");

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        String[] result = splitString(str);

        System.out.println("공백을 기준으로 나누어진 문자열 : ");

        for(String s : result) {
            System.out.print(s);
            System.out.println("   ");
        }

        sc.close();
    }
}
