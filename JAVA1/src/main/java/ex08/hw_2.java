package ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        System.out.printf("%s", lower(A));
    }

    public static String lower(String A){
        String a = A.toLowerCase();
        return a;
    }
}
