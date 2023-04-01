package ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        int month, day;

        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();

        if((month == 2) && (day > 28)){
            System.out.println("윤년입니다.");
        }
        else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
