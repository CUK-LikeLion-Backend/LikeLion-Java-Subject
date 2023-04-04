package java1.ex08;

import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine(); // "str str str"
        for(String a: split(str)){
            System.out.println(a);
        }
    }
    public static String[] split(String str){
        String[] stream=str.split("\\s");
        return stream;
    }
}
