package java1.ex08;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class hw_1 {
    public static String Upper(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println(Upper(str));
    }

}
