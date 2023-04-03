package ex07;
import java.util.*;

public class hw_1 {
    public static int addF(int num) {
        num++;
        int result = num;

        return result;
    }
    public static int addL(int num) {
        int result = num;
        num++;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = sc.nextInt();

        int result1 = addF(num);
        int result2 = addL(num);

        System.out.println(num + "의 전위 증가 결과 = " + result1);
        System.out.println(num + "의 후위 증가 결과 = " + result2);

        sc.close();
    }
}
