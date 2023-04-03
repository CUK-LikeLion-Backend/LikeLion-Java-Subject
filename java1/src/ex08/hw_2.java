package ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("변환된 문자열: "+Lower(str));
    }
    public static String Lower(String name){
        String result = name.toLowerCase();
        return result;
    }
}
