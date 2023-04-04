package java1.ex08;

public class hw_5 {
    public static void main(String[] args) {
        System.out.println(intToStr(-123));
    }
    public static String intToStr(int num) {
        boolean isMinus = false;
        if (num < 0) {
            isMinus = true;
            num = -num;
        }
        String result="";
        while(num>0){
            char i=(char)(num%10+'0');
            result=i+result;
            num/=10;
        }
        if (isMinus) {
            result='-'+result;
        }
        return result;
    }
}
