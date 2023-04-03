package ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("몇 월인가요?");
        int month=scanner.nextInt();
        System.out.print("몇 일인가요?");
        int day=scanner.nextInt();
        System.out.println(+month+"월 "+day+"일 입니다.");

        if (month==2){
            if(day>=29)
                System.out.println("윤년입니다.");
            else
                System.out.println("윤년이 아닙니다.");
        }


    }
}
