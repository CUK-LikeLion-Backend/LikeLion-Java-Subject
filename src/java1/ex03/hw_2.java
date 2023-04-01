package java1.ex03;

import java.util.Scanner;

public class hw_2 {

    public static int add(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int result = add(a, b);
        System.out.println("result = " + result);
    }
}

