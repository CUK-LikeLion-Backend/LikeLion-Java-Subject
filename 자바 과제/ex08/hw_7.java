package ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int i = s.nextInt();

        String binaryString = Integer.toBinaryString(i);
        System.out.println("변환된 숫자: " + binaryString);
    }
}
