package ex08;

import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        strarr(str);
    }

    public static void strarr(String str){
        String[] StrArr = str.split(" ");

        for (int i = 0; i < StrArr.length; i++){
            System.out.println(StrArr[i]);
        }
    }
}
