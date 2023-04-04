package ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {

        int i;
        char c;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for(i=0; i<input.length(); i++){
            c = input.charAt(i);
            if ((c=='z')||(c=='Z')){
                c = (char)(c-25);
            }else {
                c = (char)(c+1);
            }
            System.out.print(c);
        }
    }
}
