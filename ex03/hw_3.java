package ex03;

import java.util.Scanner;

public class hw_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(calcArea(radius));
    }

    static double calcArea(double r){
        return 3.14 * r;
    }
}
