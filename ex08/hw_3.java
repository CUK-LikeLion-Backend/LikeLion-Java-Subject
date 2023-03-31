package ex08;
import java.util.*;

public class hw_3 {
    public static String changeString(String str) {
        int tmp;
        String result = "";
        int l = str.length();

        for(int i = 0; i < l; i++) {
            tmp = (int) str.charAt(i);
            if(tmp == 'z' || tmp == 'Z') result += (char)(tmp - 25);
            else result += (char)(tmp + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        String result = changeString(str);

        System.out.println("변환된 문자열 : " + str + " -> " + result);

        sc.close();
    }
}
