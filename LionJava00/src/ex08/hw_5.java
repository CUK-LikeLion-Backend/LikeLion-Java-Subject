package ex08;
//정수를 문자열로 바꾸는 함수를 작성하세요.
import java.util.* ;
public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt() ;
        printVariableType(toString(num));
    }

    public static String toString(int num)
    {
        return String.valueOf(num);
    }
    public static void printVariableType(Object var) {
        System.out.println(var.getClass().getSimpleName());
    }
}

