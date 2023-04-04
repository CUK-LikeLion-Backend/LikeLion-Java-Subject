package ex08;

import java.util.Scanner;


public class hw_3 {
    public static char[] Change(String s) {
        char[] charArr = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            charArr[i]++;
        }
        return charArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        System.out.print("변환된 문자열: ");

        System.out.println(Change(s));

    }
}