package ex08;

import java.util.Scanner;
public class hw_4 {

    public static void func(String s){
        System.out.println(Integer.parseInt(s));
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.next();
        func(s);
    }
}
