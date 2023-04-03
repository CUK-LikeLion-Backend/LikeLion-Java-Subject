package ex08;

import java.util.Scanner;
// a → b, b → c, … , z → a, … ,
// A → B, … , Z → A 로 문자열을 바꾸는 함수를 작성하세요.
public class hw_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("결과값: " + Change(str));

    }

    public static String Change(String exam) {
        char[] chars = exam.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                chars[i] = (char) (c + 1);
            }
        }
        return new String(chars);
    }
}
