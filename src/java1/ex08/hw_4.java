package java1.ex08;

public class hw_4 {
    public static void main(String[] args) {
        System.out.println(strToInt("-123"));
    }

    public static int strToInt(String str) {
        int num = 0;
        boolean isMinus = false;  // str="123"
        int i = 0;
        if (str.charAt(0) == '-') {
            isMinus = true;
            i = 1;
        }
        while(i < str.length()) {
            num *= 10; //
            num += str.charAt(i++) - '0';
        }
        if (isMinus) {
            num = -num;
        }
        return num;
    }
}
