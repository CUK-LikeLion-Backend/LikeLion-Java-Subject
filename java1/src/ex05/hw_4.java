package ex05;

import java.util.Scanner;

// int형 변수 month와 day를 선언하고, month가 2이고 day가 29 이상인 경우 "윤년입니다.",
// 그 외에는 "윤년이 아닙니다."라는 메시지를 출력하는 프로그램을 작성하세요.
public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("month를 입력하세요:");
        int month = sc.nextInt();
        System.out.print("day를 입력하세요:");
        int day = sc.nextInt();

        if(month==2 & day>=29){
            System.out.println("윤년입니다.");
        }
        else
            System.out.println("윤년이 아닙니다.");
    }
}