package ex08;
import java.util.*;
import java.util.Scanner;

// 문자열을 특정 공백을 기준으로 나누어서 String 배열로 반환하는 함수를 작성하세요.
public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        //
        String[] result = change(str);
        System.out.println("변환된 결과: "+ Arrays.toString(result));
    }
    public static String[] change(String name){
        String str = name;
        String []result = str.split(" ");
        return result;
    }
}
