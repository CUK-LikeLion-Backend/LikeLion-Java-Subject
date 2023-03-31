package ex05;
import java.util.*;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 : ");
        int num = sc.nextInt();

        if(num > 0) System.out.println("입력한 수는 양수입니다.");
        else if(num == 0) System.out.println("입력한 수는 0입니다.");
        else System.out.println("입력한 수는 음수입니다.");

        sc.close();
    }
}
