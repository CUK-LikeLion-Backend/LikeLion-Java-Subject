package ex05;
import java.util.*;

public class hw_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하십시오 : ");
        int age = sc.nextInt();

        if (age >= 20) System.out.println("성인입니다.");
        else System.out.println("성인이 아닙니다.");

        sc.close();
    }
}
