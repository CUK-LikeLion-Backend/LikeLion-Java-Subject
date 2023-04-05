package ex08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int input = sc.nextInt();
            String s = Integer.toString(input);
            System.out.println(s);
        }catch(InputMismatchException e){
            System.out.println("숫자만 입력해주세요");
        }
    }
}
