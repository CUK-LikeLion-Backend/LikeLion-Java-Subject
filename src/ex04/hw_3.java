package ex04;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 : ");
        num1 = sc.nextInt();
        System.out.print("num2 : ");
        num2 = sc.nextInt();

        if((num1 % 3 == 0) && (num2 % 4 == 0))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
