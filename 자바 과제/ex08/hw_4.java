package ex08;
// 문자열을 정수로 바꾸는 함수를 작성
import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오: ");

        String str = sc.nextLine();

        int num = Integer.parseInt(str);
        System.out.println("변환된 값: " + num);

    }
}
