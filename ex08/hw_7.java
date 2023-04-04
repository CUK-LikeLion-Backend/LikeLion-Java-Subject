package ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        binaryStr(num);
    }

    public static void binaryStr(int num){
        //10진수를 제외한 나머지 진수는 String으로 받아야함
        System.out.printf(Integer.toString(num, 2));
    }
}
