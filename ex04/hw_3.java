package ex04;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1= 15;
        int num2= 8;
        if(num1%3==0 && num2%4==0)
            System.out.println("나머지가 0이 맞습니다.");
        else
            System.out.println("나머지가 0이 아닙니다.");

    }
}
