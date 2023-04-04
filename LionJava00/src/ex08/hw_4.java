package ex08;

import java.util.*;

//문자열을 정수로 바꾸는 함수를 작성하세요.
public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() ;
        printVariableType(toInt(str));
    }
    public static int toInt(String str)
    {
        return Integer.parseInt(str);
    }
    public static void printVariableType(Object var) {
        System.out.println(var.getClass().getSimpleName());
    }
}
