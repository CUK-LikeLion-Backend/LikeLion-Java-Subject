package ex06;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();

        for(int i = 0; i < num / 2 + 1; i++){
            for(int j = i; j < num / 2; j++)
                System.out.print(" ");
            for(int j = 0; j < 2*i + 1; j++)
                System.out.print("*");
            for(int j = i; j < num / 2; j++)
                System.out.print(" ");
            System.out.println();
        }


    }
}
