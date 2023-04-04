package ex08;
public class HW_3 {
    //a → b, b → c, … , z → a, … , A → B, … , Z → A 로 문자열을 바꾸는 함수를 작성하세요.
    public static void main(String[] args) {
        aTob();
        System.out.println("----");
        AtoB();

    }
    public static void aTob(){
        for(int i = 97; i<123; i++){
            char num = (char)i;
            String str = String.valueOf(num);
            String str2 = String.valueOf(++num);
            if(i<122){
                System.out.println(str +"->"+str2);
            }
            else {
                String str3 = String.valueOf((char)97);
                System.out.println(str + "->" + str3);
            }
        }
    }
    public static void AtoB(){
        for(int i = 65; i<91; i++){
            char num = (char)i;
            String str = String.valueOf(num);
            String str2 = String.valueOf(++num);
            if(i<90){
                System.out.println(str +"->"+str2);
            }
            else {
                String str3 = String.valueOf((char)65);
                System.out.println(str + "->" + str3);
            }
        }
    }
}
