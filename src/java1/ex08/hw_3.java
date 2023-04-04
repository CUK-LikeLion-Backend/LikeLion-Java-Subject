package java1.ex08;

import java.util.Scanner;

public class hw_3 {
    public static String strto(String str){
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a' && chars[i]<'z'){
                chars[i]+=1;
            }else if(chars[i]=='z'){
                chars[i]='a';
            }else if(chars[i]>='A' && chars[i]<'Z'){
                chars[i]+=1;
            }else if(chars[i]=='Z'){
                chars[i]='A';
            }
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        System.out.println(strto(str));
    }
}
