package ex08;

import java.util.Scanner;

public class hw_7 {
    public static String convert(int i){
        return Integer.toBinaryString(i);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String str = convert(i);
        System.out.println(str);
    }
}
