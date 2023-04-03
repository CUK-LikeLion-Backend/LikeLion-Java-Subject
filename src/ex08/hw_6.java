package ex08;
//문자열을 특정 공백을 기준으로 나누어서 String 배열로 반환하는 함수를 작성하세요.
public class hw_6 {
    public static String[] splitStr(String str, String delimiter){
        String[] splitted = str.split(delimiter);
        return splitted;
    }

    public static void main(String[] args) {
        String input = "안녕하세요 이가영입니다. 잘 부탁드립니다.";
        String delimiter = " ";

        String[] splitted = splitStr(input, delimiter);

        for (String s : splitted) {
            System.out.println(s);
        }
    }
}
