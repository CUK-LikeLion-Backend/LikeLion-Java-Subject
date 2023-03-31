package ex05;
import java.util.*;

public class hw_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하시오 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하시오 : ");
        int num2 = sc.nextInt();

        int result = (num1 > num2) ? num1 : num2;

        System.out.println("더 큰 수는 " + result + "입니다.");

        sc.close();
    }
}
