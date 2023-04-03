package ex08;

import java.util.Scanner;
//입력받은 문자열을  전부 대문자로 바꾸는 함수를 작성하세요.
public class hw_1 {
    public static String upperString(String s){
        return s.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(upperString(s));
    }
}
