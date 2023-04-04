package ex08;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next()는 공백을 기준으로 한단어, 한문자씩 입력받는다
        //nextLine()은 문자또는 문장 한라인 전체를 입력받는다.
        String a = sc.nextLine();

        System.out.printf("%s", upper(a));
    }

    public static String upper(String a){
        String A = a.toUpperCase();
        return A;
    }
}
