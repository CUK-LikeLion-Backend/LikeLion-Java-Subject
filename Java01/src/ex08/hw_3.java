package ex08;

import java.util.Scanner;
public class hw_3 {
    public static char Plus(char user) {
        char answer = 0;
        if (user >= 'a' && user < 'z')
            answer = (char)(user + (char)1);
        else if (user >= 'A' && user < 'Z')
            answer = (char)(user + (char)1);
        else if (user == 'z')
            answer = 'a';
        else if (user == 'Z')
            answer = 'A';
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 하나 입력하세요: ");
        char user = scanner.nextLine().charAt(0);
        System.out.println(Plus(user));
    }
}
