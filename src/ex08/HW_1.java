package ex08;
import java.util.Scanner;
public class HW_1 {
    //대문자로 바꾸는 함수
    public static void main(String[] args) {
        ABC();
    }
    public static void ABC(){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = str1.toUpperCase();
        System.out.print(str1+" -> "+str2);

    }

}
