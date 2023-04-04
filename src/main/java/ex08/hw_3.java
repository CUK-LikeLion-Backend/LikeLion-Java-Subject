package ex08;

import java.util.Scanner;

public class hw_3 {
    public static String changeCh(String str){
        String answer = "";

        for(int i = 0; i < str.length(); i++){
            if (!Character.isLetter(str.charAt(i)))
                answer += str.charAt(i);
            else if (str.charAt(i) == 'z')
                answer += 'a';
            else if (str.charAt(i) == 'Z')
                answer += 'A';
            else
                answer += ((char)(str.charAt(i) + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(changeCh(str));
    }
}