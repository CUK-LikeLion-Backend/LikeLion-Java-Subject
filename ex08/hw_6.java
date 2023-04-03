package ex08;


import java.util.Arrays; //배열을 다루기 위한 메소드

public class hw_6 {
    public static void main(String[] args) {
        String str = "Chun ji eun";
        String[] list = str.split(" ");

        System.out.println(Arrays.toString(list)); //배열 내용 출력하는 메소드
    }
}
