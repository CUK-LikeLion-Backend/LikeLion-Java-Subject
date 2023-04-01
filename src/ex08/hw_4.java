package ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try{
            int result = Integer.parseInt(input);
            System.out.println("result = " + result);
        }catch (NumberFormatException e){
            System.out.println("숫자 형태가 아닙니다.");
        }
    }
}
