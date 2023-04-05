package ex08;

import java.util.Scanner;

public class hw_7 {
    public static String toBinary(int num){
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        num = scan.nextInt();

        System.out.println(toBinary(num));
    }
}
