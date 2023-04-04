package ex08;

public class hw_4 {
    public static int parseInt(String str) {
        int num = 0;
        boolean negative = false;
        int i = 0;
        if(str.charAt(0) == '-') {
            negative = true;
            i++;
        }
        while(i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0';
        }
        return negative ? -num : num;
    }
}
