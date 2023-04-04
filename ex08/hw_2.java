package ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(LowerWord(word));
    }

    static String LowerWord(String word){
        return word.toLowerCase();
    }
}
