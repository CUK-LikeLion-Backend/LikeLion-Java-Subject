package Bonus01;
import java.util.* ;
public class bonus01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findLSL(str));
    }
    public static int findLSL( String str ) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int t = str.charAt(0) , cnt = 1 ; // 첫번째 문자의 길이도 포함해주어야함.
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i-1)==str.charAt(i)) cnt++;
            else {
                list.add(cnt);
                cnt = 1 ;
            }
        }
        list.add(cnt);
        int res = list.get(0) ;
        for(int i=0; i<list.size(); i++)
        {
            res = Math.max(res, list.get(i));
        }
        return res;
    }
}
