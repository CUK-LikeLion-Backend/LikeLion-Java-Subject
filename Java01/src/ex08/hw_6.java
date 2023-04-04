package ex08;

import java.util.Arrays;
public class hw_6 {
    public static void SplitString (String str) {
        String[] splitter= str.split(" ");
        for(int i = 0; i < splitter.length; i++) {
            System.out.println(splitter[i]);
        }
    }
    public static void main(String[] args) {
        String str = "Today is Monday.";
        SplitString(str);
    }
}
