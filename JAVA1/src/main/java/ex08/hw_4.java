package ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.printf("%d", StrToInt(str));
    }

    public static int StrToInt(String str){

        int num = Integer.parseInt(str);
        return num;
    }
}
