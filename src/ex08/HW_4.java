package ex08;

import java.util.Scanner;

public class HW_4 {
    //문자열을 정수로 바꾸는 함수
    public static void main(String[] args) {
        sToi();
    }
    public static void sToi(){
        // 꼭 숫자만 입력해야 하나(?)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer num = Integer.parseInt(str);
        System.out.println(num);
    }
}
