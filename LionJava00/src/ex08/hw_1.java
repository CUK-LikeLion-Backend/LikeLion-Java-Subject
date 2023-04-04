package ex08;
import java.util.* ;
// 입력 받은 문자열을 전부 대문자로 바꾸는 함수를 작성하세요.
public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpper(str));
    }
    public static String toUpper(String str){
        return str.toUpperCase();
    }
}
