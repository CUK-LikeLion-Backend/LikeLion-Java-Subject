package ex06;

import java.util.Scanner;
public class hw_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
