package bonus00;

import java.util.Scanner;

public class bonus00 {
    public static void main(String[] args) {
        int num;

        System.out.println("정수 입력: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("\n3진수 변환: ");
        convertThreeBase(num);
        System.out.println("\n5진수 변환: ");
        convertFiveBase(num);
        System.out.println("\n13진수 변환: ");
        convertThirteen(num);


    }

    public static void convertThreeBase(int n) {

        if(n > 1)
            convertThreeBase(n/3);

        if(n != 0)
        System.out.print(n % 3);

    }

    public static void convertFiveBase(int n) {

        if(n > 1)
            convertFiveBase(n/5);

        if(n != 0)
        System.out.print(n % 5);

    }
    public static void convertThirteen(int n) {
        int remain = n % 13;

        if(n > 1)
            convertThirteen(n/13);

        if(remain != 0) {
            if (remain < 10)
                System.out.print(remain);
            else if (remain == 10)
                System.out.println("A");
            else if (remain == 11)
                System.out.println("B");
            else if (remain == 12)
                System.out.println("C");
        }
    }
}
