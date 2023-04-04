package ex08;

import java.util.Scanner;

public class hw_6 {

    public static String[] split(String str){
        return str.split(" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = split(str);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}