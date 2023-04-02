package bonus00;

import java.util.Scanner;

public class bonus00 {

    public static void convertThreeBase(int num){
        System.out.println(Integer.toString(num,3));
    }
    public static void convertFiveBase(int num){
        System.out.println(Integer.toString(num,5));
    }
    public static void convertThirteen(int num) {
        String result = "";
        if (num == 0) {

        }

        while (num > 0) {
            int share = num / 13;
            int remainder = num % 13;
            if (remainder > 9) {
                result = (char) (remainder + 55) + result;
            } else {
                result = remainder + result;
            }
            num = share;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. ");
        int num = scanner.nextInt();
        System.out.print("3진수로 변환 : ");
        convertThreeBase(num);
        System.out.print("5진수로 변환 : ");
        convertFiveBase(num);
        System.out.print("13진수로 변환 : ");
        convertThirteen(num);


    }
}