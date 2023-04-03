package ex03;

import java.util.Scanner;
public class hw_3 {
        public static double calcArea(double r){
            return r*r*3.14;
        }

        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            double r= scan.nextInt();
            System.out.println(calcArea(r));
        }
}
