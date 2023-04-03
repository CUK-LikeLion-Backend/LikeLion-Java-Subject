package ex03;

import java.util.Scanner;

public class hw_2 {


    public static int add(int a, int b) {
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하시오 ");
        int a= scanner.nextInt();
        System.out.println("두 번째 정수를 입력하시오 ");
        int b= scanner.nextInt();

        int c=add(a,b);
        System.out.println("두 수의 합은 "+c+" 입니다.");
    }////////add함수 만들기

}
