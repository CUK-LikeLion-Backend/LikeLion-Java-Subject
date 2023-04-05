package ex08;

import java.util.Scanner;

public class hw_3 {
    public static char changeAlpha(char word){
        if(word == 'Z') return 'A';
        else if(word == 'z') return 'a';
        else return (char)(word+1);
    }
    public static void main(String[] args) {
        for(char i = 'a'; i <= 'z'; i++){
            System.out.println(changeAlpha(i));
        }
    }
}
