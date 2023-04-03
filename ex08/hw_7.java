package ex08;

import java.util.Scanner;

public class hw_7 {
    public static String toBinaryString(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary.isEmpty() ? "0" : binary;//0인경우 제외
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type int");
        int input = scanner.nextInt();
        String result = toBinaryString(input);
        System.out.println(result);
    }
}
