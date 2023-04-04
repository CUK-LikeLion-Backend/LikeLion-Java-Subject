package ex08;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.printf("%s", IntToStr(num));
    }

    public static String IntToStr(int num){
        String str = String.valueOf(num);
        return str;
    }
}
