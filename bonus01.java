import java.util.Scanner;

public class bonus01 {
    public static int longString(String str){
        int cnt = 1, length = 1;
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)) cnt++;
            else cnt = 1;
            length = Math.max(length, cnt);
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        str = scan.nextLine();

        System.out.println(longString(str));
    }
}
