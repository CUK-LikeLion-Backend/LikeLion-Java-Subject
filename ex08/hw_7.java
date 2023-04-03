package ex08;

public class hw_7 {
    public static String toBinary(int num){
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        int a = 122;
        System.out.println(toBinary(a));
    }
}
