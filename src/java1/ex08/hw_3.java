package java1.ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {

        int i;

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for(i=0; i<input.length(); i++){

            char c = input.charAt(i);

            if((c=='z') || (c=='Z')){
                System.out.println((char)(c-25));
                return;
            }

            System.out.print((char)(c + 1));
        }
    }
}
