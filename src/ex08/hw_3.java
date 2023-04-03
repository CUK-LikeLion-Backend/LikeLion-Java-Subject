package ex08;

import java.util.Scanner;
public class hw_3 {

    public static void func(String s){
        char[] array=s.toCharArray();
        for(int i=0;i<array.length;i++) {
            if (array[i] == 'z') array[i] = 'a';
            else if (array[i] == 'Z') array[i] = 'A';
            else {
                int a = Integer.valueOf(array[i]) + 1;
                array[i] = (char) (a);
            }
        }
        for (char a:array) {
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        func(s);

    }
}
