package ex05;
import java.util.*;

public class hw_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하시오 : ");
        int score = sc.nextInt();

        if(score >= 90) System.out.println("A학점 입니다.");
        else if(score >= 80) System.out.println("B학점 입니다.");
        else if(score >= 70) System.out.println("C학점 입니다.");
        else System.out.println("D학점 입니다.");

        sc.close();
    }
}
