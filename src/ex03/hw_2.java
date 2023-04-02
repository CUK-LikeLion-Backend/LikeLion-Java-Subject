package ex03;

import java.util.Scanner;

public class hw_2 {
    public static int add( int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println(add(a,b));
    }
}
