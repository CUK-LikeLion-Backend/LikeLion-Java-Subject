package ex03;
import java.util.Scanner;//Scanner 클래스를 사용

public class hw_3 {
    public static void main(String[] args) {
        double result = calcArea();
        System.out.println("원의 넓이는 : " + result);
    }

    public static double calcArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("반지름을 입력하시오 : ");
        double radius = scanner.nextDouble();
        return radius*radius*3.14;
    }
}