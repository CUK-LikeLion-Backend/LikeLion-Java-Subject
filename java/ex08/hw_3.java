package ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.printf("%s", change(a));
    }

    public static String change (String alp) {
        char[] chars = alp.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c >= 'a' && c < 'z') {
                chars[i] = (char) (c + 1);
            } else if (c == 'z') {
                chars[i] = 'a';
            } else if (c >= 'A' && c < 'Z') {
                chars[i] = (char) (c + 1);
            } else if (c == 'Z') {
                chars[i] = 'A';
            }
        }

        return new String(chars);
    }
}
