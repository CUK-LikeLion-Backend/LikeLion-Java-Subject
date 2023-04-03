package ex08;

public class hw_4 {
    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String num = "123456";
        System.out.println(num);
        System.out.println(toInt(num));
    }
}
