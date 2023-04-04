package bonus00;

import java.util.Scanner;

public class bonus00 {
    public static void convertTwoBase(int num) {
        String str = "";

        while (num / 2 > 0) {
            str = (num % 2) + str;
            num /= 2;
        }
        str = (num % 2) + str;
        System.out.println(str);
    }
    public static void convertThreeBase(int num) {
        String str = "";

        while (num / 3 > 0) {
            str = (num % 3) + str;
            num /= 3;
        }
        str = (num % 3) + str;
        System.out.println(str);
    }
    public static void convertFiveBase(int num) {
        String str = "";
        while (num / 5 > 0) {
            str = (num % 5) + str;
            num /= 5;
        }
        str = (num % 5) + str;
        System.out.println(str);
    }
    public static void convertThirteen(int num) {
        char[] arr = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'};
        String str = "";
        while (num / 13 > 0) {
            str = arr[num % 13] + str;
            num /= 13;
        }
        str = arr[num % 13] + str;
        System.out.println(str);
    }

    public static void main(String[] args) {
        convertTwoBase(13);
        convertThreeBase(13);
        convertFiveBase(13);
        convertThirteen(13);
    }
}
