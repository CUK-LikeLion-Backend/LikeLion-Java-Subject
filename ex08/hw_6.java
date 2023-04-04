package ex08;

import java.util.StringTokenizer; //문자열을 지정한 구분자로 쪼개주는 클래스

public class hw_6 {
    public static void main(String[] args) {
        String str = "This is a sample string";
        String[] words = splitString(str, " ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] splitString(String str, String delimiter) {
        StringTokenizer st = new StringTokenizer(str, delimiter);
        int size = st.countTokens(); //토큰개수 반환
        String[] arr = new String[size];
        int i = 0;
        while (st.hasMoreTokens()) { //토큰이 더 있는지 확인
            arr[i] = st.nextToken();
            i++;
        }
        return arr;
    }
}

