package java1.ex08;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        try{
            String result = Integer.toString(input);
            System.out.println("result = " + result);
        }catch (Exception e){
            System.out.println("에러");
        }
    }
}
