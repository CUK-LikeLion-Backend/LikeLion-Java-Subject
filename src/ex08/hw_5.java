package ex08;

public class hw_5 {
    public static String toString(int num) {
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        if(num < 0) {
            negative = true;
            num = -num;
        }
        while(num > 0) {
            sb.insert(0, num % 10);
            num /= 10;
        }
        if(negative) sb.insert(0, '-');
        return sb.toString();
    }
}
