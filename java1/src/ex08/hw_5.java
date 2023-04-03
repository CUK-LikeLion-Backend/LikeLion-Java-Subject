package ex08;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        System.out.println("변환된 결과: "+change(num));
    }
    public  static String change(int num){

            String result =  Integer.toString(num);
            return result;

    }
}
