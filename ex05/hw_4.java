package ex05;
import java.util.*;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 월인지 입력하시오 : ");
        int month = sc.nextInt();
        System.out.print("며칠인지 입력하시오 : ");
        int day = sc.nextInt();

        if(month >= 2 && day >= 29) System.out.println("윤년입니다.");
        else System.out.println("윤년이 아닙니다.");

        sc.close();
    }
}
