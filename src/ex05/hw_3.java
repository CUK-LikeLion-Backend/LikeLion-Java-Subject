package ex05;

import java.util.Scanner;
public class hw_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score<70) System.out.println("D");
        else if(score<80) System.out.println("C");
        else if(score<90) System.out.println("B");
        else if(score>=90) System.out.println("A");
    }
}
