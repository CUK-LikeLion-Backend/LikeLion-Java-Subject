package ex08;
import java.util.Scanner;

public class hw_1 {
    public static String toUpper(String str) {

        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        str = scan.nextLine();

        System.out.println(toUpper(str));
    }
}
