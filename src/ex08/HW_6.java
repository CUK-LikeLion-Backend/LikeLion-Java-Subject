package ex08;

public class HW_6 {
    //문자열을 특정 공백을 기준으로 나누어서 String 배열로 반환하는 함수
    public static void main(String[] args) {
        str();
    }
    public static void str(){
        String str1 = "오늘의 날씨는 맑습니다.";
        String words[] = str1.split(" ");
        for(String w : words){
            System.out.println(w);
        }
    }

}
