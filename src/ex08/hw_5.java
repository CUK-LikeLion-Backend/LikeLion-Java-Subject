package ex08;
//정수를 문자열로 바꾸는 함수를 작성하세요.
public class hw_5 {
    public static String convertIntegerToString(int num){
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        int num = 1234567;
        String s = convertIntegerToString(num);
        System.out.println(s);
    }
}
