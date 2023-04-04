package ex03;

import java.util.*;

public class hw_3 {
    public static double calcArea (double r) {
        double res = Math.pow(r,2) * Math.PI ;
        return res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름 입력 : ");
        double r = sc.nextInt() ;
        System.out.println(calcArea(r));
    }

}
