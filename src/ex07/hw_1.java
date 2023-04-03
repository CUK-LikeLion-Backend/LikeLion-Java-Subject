package ex07;

import java.util.Scanner;

public class hw_1 {

    public static int preIncrease(int p){
        p=p+1;
        return p;
    }
    public static int postIncrease(int p){
        return p;
    }
    public static void main(String[] args) {
        Integer a = 0;
        System.out.println(postIncrease(a));
        a = 0;
        System.out.println(a++);
        a = 0;
        System.out.println(++a);
        a = 0;
        System.out.println(preIncrease(a));

    }
}
