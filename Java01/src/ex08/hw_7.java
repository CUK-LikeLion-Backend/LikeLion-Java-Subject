package ex08;

import java.util.Scanner;
public class hw_7 {
    public static String toBinary(int num) {
        return Integer.toBinaryString(num);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요: ");
        int num = scanner.nextInt();
        System.out.print(toBinary(num));
    }
}
