package ex08;
import java.util.Scanner;
public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String str1 = sc.nextLine();

        toInt(str1);
    }

    public static void toInt(String str2){
        int num = Integer.parseInt(str2);

        System.out.println(num);
    }


}
