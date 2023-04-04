package ex08;
import java.util.Scanner;
public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int n = sc.nextInt();

        toStr(n);
    }

    public static void toStr(int num){
        String str;
        str = Integer.toString(num);

        System.out.println(str);
    }

}
