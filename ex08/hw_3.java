package ex08;

import java.util.Scanner;

public class hw_3 {
    static int nextStr(int str){

        str = (int)str+1;
        if(str>90&&str<99){ //Z나 a 사이의 값이 들어오면, A로 출력
            str = 65;
        }
        if(str>122) { //z나 이상의 값이 들어오면 a로 출력
            str = 97;
        }
        return str;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("영어 문자열을 입력하시오: ");
        char str=scanner.nextLine().charAt(0);
        str = (char)nextStr(str);
        System.out.println(str);

//        System.out.println();
    }}///////////////
