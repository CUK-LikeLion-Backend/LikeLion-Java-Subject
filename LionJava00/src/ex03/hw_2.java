package ex03;

import java.util.*;
public class hw_2 {
    int add(int num1, int num2 )
    {
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        hw_2 t = new hw_2();
        System.out.println(t.add(a,b));
    }
}