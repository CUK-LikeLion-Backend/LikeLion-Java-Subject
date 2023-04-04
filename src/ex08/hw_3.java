package ex08;
public class hw_3 {
    public static String replaceString(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c >= 'a' && c <= 'z') {
                sb.setCharAt(i, (char)(c+1));
                if(sb.charAt(i) > 'z') sb.setCharAt(i, 'a');
            }
            else if(c >= 'A' && c <= 'Z') {
                sb.setCharAt(i, (char)(c+1));
                if(sb.charAt(i) > 'Z') sb.setCharAt(i, 'A');
            }
        }
        return sb.toString();
    }
}
