package ex08;

import java.util.Scanner;

public class hw_5 {
    public static String convert(int s) {
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        String s = convert(n);
        System.out.println(s);
    }
}
