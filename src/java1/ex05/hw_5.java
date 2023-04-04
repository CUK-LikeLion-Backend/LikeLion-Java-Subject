package java1.ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int result=num1>num2 ? num1 : num2;
        System.out.println(result);
    }
}
