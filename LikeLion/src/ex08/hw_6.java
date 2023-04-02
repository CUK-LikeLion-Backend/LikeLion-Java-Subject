package ex08;

import java.util.Arrays;
import java.util.Scanner;

public class hw_6 {

    public static void split(String str){
        String[] list = str.split(" ");
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. ");
        String str = scanner.next();
        split(str);

    }


}