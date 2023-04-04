package ex08;
import java.util.* ;
//문자열을 특정 공백을 기준으로 나누어서 String 배열로 반환하는 함수를 작성하세요.
public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] Arr = splitString(str);
        for(int i=0; i<Arr.length; i++) System.out.println(Arr[i]);
    }
    public static String[] splitString(String str)
    {
        // '\\s' 는 1개 이상 연속해서 나옴을 의미한다.
        // '+' 공백 문자열(하나 이상의 띄어쓰기, 탭, 줄바꿈이 있는 문자열 )을 의미
        String[] strArr =  str.split("\\s+");
        return strArr;
    }
}



