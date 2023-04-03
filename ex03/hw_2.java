package ex03;
import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        int result = add();
        System.out.println("두 수의 합: " + result);
    }

    public static int add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();
        int sum = a + b;
        return sum;
    }
}