package ex08;

import java.util.Scanner;

public class hw_6 {
    public static String[] divideString(String str,String div) {
        return str.split(div);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type string");
        String input = scanner.nextLine();
        String div = " ";
        String[] result = divideString(input,div);
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i]);
        }

    }
}
