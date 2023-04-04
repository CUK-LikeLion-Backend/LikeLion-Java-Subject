package java1.ex06;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=1;i<=num/2+1;i++){ // 1 2 3 4 5
            for(int j=num/2;j>=i;j--){ // 4 3 2 1 0
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){ // 1 3 5 7 9
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*

    공백: 4 3 2 1 0
    별:   1 3 5 7 9
    9->5

    공백: 3 2 1 0
    별  : 1 3 5 7
    7->4

    공백: 2 1 0
    별  : 1 3 5
    5->3

     */
}
