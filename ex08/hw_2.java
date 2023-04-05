package ex08;
import java.util.Scanner;

public class hw_2 {
    public static String toLower(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        str = scan.nextLine();

        System.out.println(toLower(str));
    }
}
