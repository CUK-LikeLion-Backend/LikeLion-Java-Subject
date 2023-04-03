package ex03;
import java.util.*;

public class hw_3 {
    public static double calcArea(double radius) {
        return 3.14 * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하시오 : ");
        double radius = sc.nextDouble();
        double result = calcArea(radius);

        System.out.println("원의 넓이 = " + result);

        sc.close();
    }
}
