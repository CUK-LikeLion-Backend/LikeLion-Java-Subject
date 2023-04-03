package ex08;
import java.util.*;
import java.util.Scanner;

// 입력받은 숫자를 2진수 문자열로 반환하는 함수를 작성하세요.
public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        System.out.println("변환된 결과: "+ change(num));
    }
    // toBinaryString메소드는 integer 클래스의 정적 메소드이기에 메소드 호출할때 Integer.toBinaryString() 이렇게
    public static String change(int num){
        String result = Integer.toBinaryString(num);
        return result;

    }
}
