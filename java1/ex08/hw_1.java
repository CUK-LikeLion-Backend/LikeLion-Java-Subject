package java1.ex08;

import java.util.Scanner;

public class hw_1 {
    public static String toUpper(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpper(str));
    }
}
