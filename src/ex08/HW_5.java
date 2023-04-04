package ex08;

import java.util.Scanner;

public class HW_5 {
    //정수를 문자열로 바꾸는 함수
    public static void main(String[] args) {
        iTos();
    }
    public static void iTos(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf((char)num);
        System.out.println(str);
    }

}
