package ex08;

import java.util.Scanner;
public class hw_1 {
    public static void main(String[] args) {
        upper();
    }

    public static void upper(){
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력: ");
        str = sc.nextLine();

        String bigStr = str.toUpperCase();

        System.out.println("대문자로 변환: "+bigStr);


    }


}
