package ex05;
import java.util.* ;
public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt() ;
        // 삼항 연산자 _ 조건이 참일떄는 왼쪽, 거짓일떄는 오른쪽이 담김
        int res = (num1>num2)? num1:num2 ;
        System.out.println(res);
    }
}
