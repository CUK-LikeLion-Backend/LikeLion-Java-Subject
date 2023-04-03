package ex05;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("점수를 입력하시오: ");
        int score=scanner.nextInt();

        if(score>=90)
            System.out.println("A");
        else if(score>=80)
            System.out.println("B");
        else if(score>=70)
            System.out.println("B");
        else
            System.out.println("D");
    }
}
