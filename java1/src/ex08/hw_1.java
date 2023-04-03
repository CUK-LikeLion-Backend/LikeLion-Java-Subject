package ex08;
import java.util.Scanner;
public class hw_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("변환된 문자열: "+Upper(str));
    }
    // JAVA에서는 문자열을 대문자 혹은 소문자로 변환하고 싶다면
    // String클래스의 toUpperCase()와 toLowerCase()를 사용하면 됩니다.
    public static String Upper(String name){
        String result = name.toUpperCase();
        return result;
    }
}
