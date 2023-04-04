package ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        int month, day;

        Scanner sc1 = new Scanner(System.in);
        month = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        day = sc2.nextInt();

        if((month == 2) &&(day >= 29)){
            System.out.println("윤년입니다.");
        }
        else
            System.out.println("윤년이 아닙니다.");
    }
}
