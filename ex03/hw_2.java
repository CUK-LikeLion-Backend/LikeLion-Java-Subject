package ex03;

import java.util.Scanner;
public class hw_2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = add(num1, num2);
        System.out.println(result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}

