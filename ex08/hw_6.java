package ex08;

import java.util.Arrays;
import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String str1 = sc.nextLine();

        toStringArr(str1);
    }
    public static void toStringArr(String str2){
        String[] arr = str2.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
