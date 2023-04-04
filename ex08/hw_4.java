package ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(ChangetoInt(word));
    }
    static int ChangetoInt(String word){
        return Integer.parseInt(word);
    }
}
