package ex05;
import java.util.Scanner;

public class hw_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.print("양수입니다.");
        }
        else if (num < 0) {
            System.out.print("음수입니다.");
        }
        else{
            System.out.print("0입니다.");
        }

    }
}
