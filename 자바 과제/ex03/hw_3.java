package ex03;

public class hw_3 {
    public static double calArea(double radius) {

        return radius * radius * 3.14;
    }

    public static void main(String[] args) {

        double radius = 3.0;
        double area = calArea(radius);
        System.out.println(area);
    }
}
