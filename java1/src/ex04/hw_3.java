package ex04;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int num1 = sc.nextInt();
        System.out.print("Enter second number");
        int num2 = sc.nextInt();

        if(num1 % 3==0 && num2 %4==0 ){
            System.out.println("조건에 부합합니다.");
        }
        else
            System.out.println("조건에 부합하지 않습니다.");
    }
}
