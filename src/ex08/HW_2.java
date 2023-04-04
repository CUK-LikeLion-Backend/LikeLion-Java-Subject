package ex08;

import java.util.Scanner;

public class HW_2 {
    //소문자로 바꾸는 함수
    public static void main(String[] args) {
        abc();
    }
    public static void abc(){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = str1.toLowerCase();
        System.out.print(str1+" -> "+str2);

    }
}
