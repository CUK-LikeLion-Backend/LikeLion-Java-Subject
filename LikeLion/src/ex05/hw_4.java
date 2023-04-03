package ex05;
import java.util.Scanner;

public class hw_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력하세요. ");
        int month = scanner.nextInt();
        System.out.print("일을 입력하세요. ");
        int day = scanner.nextInt();

        if ( month == 2 && day >= 29){
            System.out.print("윤년입니다.");
        }
        else{
            System.out.print("윤년이 아닙니다.");
        }

    }
}