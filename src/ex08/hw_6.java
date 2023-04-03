package ex08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class hw_6 {

    public static void func(String str){
        String[] array=str.split(" ");
        for (String s:array) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        func(str);
    }
}
