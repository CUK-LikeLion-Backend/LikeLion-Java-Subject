package bonus00;
import java.util.Scanner;

public class bonus00 {

    public static int convertThreeBase(int num) {
        System.out.println("3진수로 변환된 숫자: " + Integer.toString(num, 3));
        return num;
    }

    public static int convertFiveBase(int num) {
        System.out.println("5진수로 변환된 숫자: " + Integer.toString(num, 5));
        return num;
    }

    public static int convertThirteen(int num) {
        System.out.println("13진수로 변환된 숫자: " + Integer.toString(num, 13));
        return num;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자 입력: ");
            int num = sc.nextInt();

            convertThreeBase(num);
            convertFiveBase(num);
            convertThirteen(num);
    }
}