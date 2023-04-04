package ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try{
            int i = Integer.parseInt(input);
            System.out.println(i);
        }
        catch(NumberFormatException e){
            System.out.println("숫자가 아닙니다");
        }
    }
}
