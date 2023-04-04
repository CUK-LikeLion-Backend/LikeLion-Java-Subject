package ex08;

import java.util.Scanner;
public class hw_4 {

    public static int convert(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s = scan.nextLine();
        int n = convert(s);
        System.out.println(n);
    }
}