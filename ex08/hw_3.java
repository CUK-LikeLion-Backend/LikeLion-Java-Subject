package ex08;

import java.util.Scanner;

public class hw_3 {
    public static String changeString(String str){
        StringBuilder stb = new StringBuilder();
        char c;
        for(int i=0;i<+str.length();i++)
        {
            c=str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + 1) % 26 + 'a');
            }
            else if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + 1) % 26 + 'A');
            }
            stb.append(c);//문자들을 연결해줌
        }
        return stb.toString();//String으로 변환이 필요함
    }

    public static String upperCase(String str) {
        return str.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type string");
        String input = scanner.nextLine();
        String result = changeString(input);

        System.out.println(result);
    }
}
