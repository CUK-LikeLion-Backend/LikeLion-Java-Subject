package java1.ex03;

import java.util.Scanner;

public class hw_3 {
    static double calcArea(double radius){
        final double PI = 3.14;

        return (PI * radius * radius);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double result = calcArea(radius);
        System.out.println("result = " + result);
    }
}
