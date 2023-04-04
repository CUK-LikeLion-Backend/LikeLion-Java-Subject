package java1.ex08;

import java.util.Scanner;

public class hw_5 {
    public static String toStr(int num){
        String str = num + "";
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(toStr(num));
    }
}
