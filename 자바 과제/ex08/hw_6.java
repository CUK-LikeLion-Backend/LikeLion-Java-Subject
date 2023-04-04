package ex08;

public class hw_6 {
    public static void main(String[] args) {
        String str = "자바 파이썬 C언어";

        String[] stChange = str.split("\\s"); // 공백을 기준으로 나누기
        System.out.println(stChange[0]);
        System.out.println(stChange[1]);
        System.out.println(stChange[2]);
    }
}
