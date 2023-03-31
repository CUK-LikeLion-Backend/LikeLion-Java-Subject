package ex03;
import java.util.*;

public class hw_2 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.print("b를 입력하시오 : ");
        int b = sc.nextInt();

        int result = add(a, b);

        System.out.println("a + b = " + result);

        sc.close();
    }
}
