package ex08;

import java.util.Scanner;

//입력받은 문자열을 전부 소문자로 바꾸는 함수를 작성하세요.
public class hw_2 {
    public static String lowerString(String s){
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(lowerString(s));
    }
}
