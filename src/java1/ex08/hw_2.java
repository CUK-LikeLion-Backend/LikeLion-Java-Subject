package java1.ex08;

import java.util.Scanner;

public class hw_2 {
    public static String Lower(String str){
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println(Lower(str));
    }
}
