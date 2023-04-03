package java1.ex08;

import java.util.ArrayList;
public class hw_6 {
    static ArrayList<String> strSplit(String str){
        //공백 기준 문자열 자르기
        String[] tmpStr = str.split("\\s");
        ArrayList<String> ans = new ArrayList<>();

        //자른 문자열 새 문자열에 담기
        for(int i = 0; i < tmpStr.length; i++){
            ans.add(tmpStr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        ArrayList<String> list = new ArrayList<>();

        System.out.println(strSplit(str));
    }
}
