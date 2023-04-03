package java1.ex03;

//입력 받기 위한 클래스
import java.util.Scanner;
public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("a를 입력하세요: ");
        a = sc.nextInt();

        System.out.print("b를 입력하세요: ");
        b = sc.nextInt();

        System.out.println("a + b = " + (a + b));

    }
}
