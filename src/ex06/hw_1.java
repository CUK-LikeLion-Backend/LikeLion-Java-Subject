package ex06;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=1;
        int sum=0;
        while(a<11){
            sum+=a++;
        }
        System.out.println(sum);
    }
}
