package java1.ex03;

import java.util.Scanner;
public class hw_3 {

    public static double getArea(double radius){
        double area = radius * radius * 3.14;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        double radius = sc.nextDouble();

        System.out.println("면적은 " + getArea(radius));

    }
}
