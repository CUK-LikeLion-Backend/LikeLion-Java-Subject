package java1.ex08;

import java.util.Scanner;
public class hw_4 {
    public static int toInt(String str){
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toInt(str));
    }
}
