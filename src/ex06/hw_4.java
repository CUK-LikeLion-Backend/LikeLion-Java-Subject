package ex06;

import java.util.Scanner;
public class hw_4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=1;
        while(a<101) {
            if (a % 3 == 0) {
                if (a % 4 == 0) System.out.println(a);
            }
            a++;
        }
    }
}
