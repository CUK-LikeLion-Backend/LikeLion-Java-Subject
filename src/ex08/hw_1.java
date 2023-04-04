package ex08;
import java.util.Scanner;

public class hw_1 {
    public static void Scan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("소문자를 입력해주세요 대문자로 반환해드립니다.: ");
        char alpha = sc.next().charAt(0);
        alpha-=32;
        System.out.printf("%c",alpha);
    }

    public static void main(String[] args) {
        Scan();
    }
}
