package ex08;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(UpperWord(word));
    }
    static String UpperWord(String word){
        return word.toUpperCase();
    }
}
