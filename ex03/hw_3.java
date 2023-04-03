package ex03;

import java.util.Scanner;
public class hw_3 {

    public static double calcArea(double radius) {
       double width=radius*radius*3.14;
       return width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("반지름의 길이를 입력하시오 ");
        double radius= scanner.nextDouble();
        double width=calcArea(radius);
        System.out.println("원의 넓이는 "+width+" 입니다.");

    }

}
