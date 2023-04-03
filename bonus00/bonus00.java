package bonus00;
import java.util.*;

public class bonus00 {
    public static void convertThreeBase(int num) {
        System.out.println(num + "을(를) 3진수로 변환한 결과 = " + Integer.toString(num, 3));
    }
    public static void convertFiveBase(int num) {
        System.out.println(num + "을(를) 5진수로 변환한 결과 = " + Integer.toString(num, 5));
    }
    public static void convertThirteenBase(int num) {
        System.out.println(num + "을(를) 13진수로 변환한 결과 = " + Integer.toString(num, 13));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("변환할 정수를 입력하시오 : ");
        int num = sc.nextInt();

        convertThreeBase(num);
        convertFiveBase(num);
        convertThirteenBase(num);

        sc.close();
    }
}
