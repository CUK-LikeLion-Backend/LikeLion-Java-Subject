package ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("변환된 결과: "+change(str));

    }
    // parseInt : String -> int로
    //
    public static int change(String str){
        int result =  Integer.parseInt(str);
        return result;
    }
}
