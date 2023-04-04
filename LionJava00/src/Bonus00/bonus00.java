package Bonus00;
import java.util.* ;
public class bonus00 {
    // 입력받은 숫자를 3진수, 5진수, 13진수로 변환하고 출력하는 함수를 작성해보세요~
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertThreeDase(num));
        System.out.println(convertFiveDase(num));
        System.out.println(convertThirteen(num));
    }
    public static String convertThreeDase(int num)
    {
        String s = "";
        String reverse ="";
        while(num!=0)
        {
            s+=(num%3);
            num /= 3;
        }
        for(int i=s.length()-1; i>=0 ; i--)
        {
            reverse += s.charAt(i) ;
        }
        return reverse;
    }
    public static String convertFiveDase(int num)
    {
        String s = "";
        String reverse ="";
        while(num!=0)
        {
            s+=(num%5);
            num /= 5;
        }
        for(int i=s.length()-1; i>=0 ; i--)
        {
            reverse += s.charAt(i) ;
        }
        return reverse;
    }
    public static String convertThirteen(int num)
    {
        String s = "";
        String reverse ="";
        while(num!=0)
        {
            if(num%13<10) s+=(num%13) ;
            else {
                s += (char)((num%13)+55);
            }
            num /= 13;
        }
        for(int i=s.length()-1; i>=0 ; i--)
        {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
