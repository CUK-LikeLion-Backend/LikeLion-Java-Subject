package ex08;

import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input_List = sc.nextLine().split(" ");

        System.out.println("input_List = " + input_List);
        for (String s: input_List) {
            System.out.println(s);
        }
    }
}
