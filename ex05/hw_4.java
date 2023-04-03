package ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month? : ");
        int month = scanner.nextInt();
        System.out.print("Day? : ");
        int day = scanner.nextInt();
        if((month==2)&&(day>=29))
        {
            System.out.println("운년입니다.");
        }
        else
        {
            System.out.println("운년이 아닙니다.");
        }
    }
}
