package ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("month: ");
        int month = s.nextInt();
        System.out.print("day: ");
        int day = s.nextInt();


        if (month == 2 && day >= 29) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
