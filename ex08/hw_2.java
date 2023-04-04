package ex08;

import java.util.Scanner;
public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력: ");
        String str1 = sc.nextLine();

        Lower(str1);
    }

    public static void Lower(String str2){
        String lower;
        lower = str2.toLowerCase();

        System.out.println("변환 후 :  "+ lower);
    }
}
