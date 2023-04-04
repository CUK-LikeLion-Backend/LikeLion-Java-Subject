package java1.ex08;

public class hw_3 {
    public static String changeCh(String str){
        String ans = "";

        // 문자열.charAt(인덱스) -> 해당 인덱스의 문자 구하기
        for(int i = 0; i < str.length(); i++){
            // 아스키 코드 숫자 -> 문자로 변환 후 문자열에 추가
            ans = ans + ((char)(str.charAt(i) + 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("변환한 문자열은 " + changeCh(str));
    }
}
