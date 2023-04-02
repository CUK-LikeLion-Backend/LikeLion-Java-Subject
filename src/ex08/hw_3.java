package ex08;
//a → b, b → c, … , z → a, … , A → B, … , Z → A 로 문자열을 바꾸는 함수를 작성하세요.
//'A' = 65, 'Z' = 90 'a' = 97, 'z' = 122
public class hw_3 {
    public static String nextAlphabet(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c >= 'a' && c < 'z'){
                c = (char)(c+1);
            }else if(c == 'z'){
                c = 'a';
            }else if(c >= 'A' && c < 'Z'){
                c = (char)(c+1);
            }
            else if(c == 'Z'){
                c = 'A';
            }
            chars[i] = c;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(nextAlphabet("abcxyzABCXYZ"));
    }
}
