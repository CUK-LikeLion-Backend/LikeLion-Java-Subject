package ex08;

import java.util.Scanner;

public class HW_7 {
    //입력받은 숫자를 2진수 문자열로 반환하는 함수
    public static void main(String[] args) {
        System.out.println(bin());
    }
    public static String bin(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = Integer.toBinaryString(i);
        return s;
    }

}
