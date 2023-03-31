package ex04;
import java.util.*;

public class hw_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("num1을 입력하시오 : ");
        int num1 = sc.nextInt();
        System.out.print("num2를 입력하시오 : ");
        int num2 = sc.nextInt();

        if(num1 % 3 == 0 && num2 % 4 == 0) {
            System.out.println("num1은 3의 배수이고 num2는 4의 배수입니다.");
        }
        else {
            System.out.println("num1이 3의 배수가 아니거나 num2가 4의 배수가 아닙니다.");
        }

        sc.close();
    }
}
