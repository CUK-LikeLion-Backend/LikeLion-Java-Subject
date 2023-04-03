package ex06;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
