package ex08;

import java.util.Scanner;

public class hw_1 {

    public static void func(String s){
        s=s.toUpperCase();
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.next();
        func(s);
    }
}
