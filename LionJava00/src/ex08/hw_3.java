package ex08;
import java.util.*;
//a → b, b → c, … , z → a, … , A → B, … , Z → A 로 문자열을 바꾸는 함수를 작성하세요
/* 문자열(String)은 내부적으로 배열(char[])로 구현되어 있지만, 문자열은 불변(immutable) 객체이기 때문에 배열의 값을 직접 수정할 수 없습니다.
그래서 문자열의 각 문자에 접근할 때는 charAt() 함수를 사용해야 합니다.
charAt() 함수는 지정된 위치의 문자를 반환합니다 */
public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = StringUnicodePlusOne(str);
        System.out.println(str);
    }
    public static String StringUnicodePlusOne(String str)
    {
        String s = "";
        for(int i=0; i<str.length(); i++)
        {
            char c = (char)(str.charAt(i)+1);
            s += c;
        }
        return s ;
    }
}

