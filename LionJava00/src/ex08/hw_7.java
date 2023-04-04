package ex08;

import java.util.Scanner;

//입력받은 숫자를 2진수 문자열로 반환하는 함수를 작성하세요.
public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;
        System.out.println(ToBinaryString(num));
    }
    public static String ToBinaryString(int n)
    {
        return Integer.toBinaryString(n);
    }
}
