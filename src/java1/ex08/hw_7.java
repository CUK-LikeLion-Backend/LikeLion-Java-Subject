package java1.ex08;

import java.util.ArrayList;
import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt(); // num=20
        System.out.println(binary(num));
    }

    public static String binary(int num){
        String resultStr="";

        while(num>0){
            int remainder =num%2;
            String.valueOf(remainder);
            resultStr=remainder+resultStr;
            num/=2;
        }
        return resultStr;
    }
}
