package ex08;

import java.util.Scanner;

public class hw_2 {
    public static void ChangeTo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("대문자를 입력해주세요 소문자로 반환해드립니다.: ");
        char alpha = sc.next().charAt(0);
        alpha+=32;
        System.out.printf("%c",alpha);
    }
    public static void main(String[] args) {
        ChangeTo();
    }
}
