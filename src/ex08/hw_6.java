package ex08;

import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");

        for (String s: array) {
            System.out.println(s);
        }
    }
}
