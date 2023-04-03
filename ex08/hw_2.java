package ex08;

import java.util.Scanner;

public class hw_2 {
    public static String upperCase(String str) {
        return str.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type string");
        String input = scanner.nextLine();
        String result = upperCase(input);
        System.out.println(result);
    }
}
