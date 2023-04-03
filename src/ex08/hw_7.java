package ex08;
//입력받은 숫자를 2진수 문자열로 반환하는 함수를 작성하세요.
public class hw_7 {
    public static String convertBinaryStr(int num){
        String binaryNum = Integer.toString(num,2);

        return binaryNum;
    }

    public static void main(String[] args) {
        int n = 100;

        System.out.println(convertBinaryStr(n).toString());
    }
}
