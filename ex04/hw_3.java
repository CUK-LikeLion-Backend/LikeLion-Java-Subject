package ex04;

import java.util.Scanner;

public class hw_3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 % 3 ==0? "True": "False");
        System.out.println(num2 % 4 == 0? "True": "False");
    }
}
