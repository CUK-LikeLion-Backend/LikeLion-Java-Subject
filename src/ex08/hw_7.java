package ex08;

import java.util.Scanner;

public class hw_7 {

    public static void func(int i){
        String binaryString = Integer.toBinaryString(i);
        System.out.println(binaryString);
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int i=scan.nextInt();
        func(i);
    }
}
