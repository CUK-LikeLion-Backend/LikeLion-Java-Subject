package java1.ex05;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>19){
            System.out.println("성인입니다.");
        }
    }
}
