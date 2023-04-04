package ex03;

public class hw_3 {
    public static void main(String[] args) {

        System.out.println(calcArea(5));
    }

    public static double calcArea(double radius){
        final double pi = 3.14;     //상수

        double area;
        area = pi * radius * radius;

        return area;
    }
}
