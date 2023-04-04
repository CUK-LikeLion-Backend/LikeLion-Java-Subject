package ex08;

import java.util.Scanner;
public class hw_3 {
    public static void main(String[] args) {
        char[] alphabets = new char[52];

        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) ('a' + i);  //'a'에 i를 더한 결과가 int형으로 처리되기에 char 형변환 해줘야함
        }
        for (int i = 0; i < 26; i++){
            alphabets[i+26] = (char) ('A' + i);
        }

        for(int i=0; i < alphabets.length; i++){
            System.out.print(alphabets[i] + " ");
        }


        for(int i = 0; i < alphabets.length; i++){
            if(((alphabets[i] >= 'a') && (alphabets[i] < 'z')) || ((alphabets[i] >= 'A') && (alphabets[i] < 'Z')) )
                alphabets[i] = alphabets[i+1];
            else if(alphabets[i] == 'z')
                alphabets[i] = 'a';
            else if(alphabets[i] == 'Z')
                alphabets[i] = 'A';

        }

        System.out.println();
        System.out.println("변환 후: ");
        for(int i=0; i < alphabets.length; i++){
            System.out.print(alphabets[i] + " ");
        }



    }
}
