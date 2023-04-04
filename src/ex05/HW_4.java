package ex05;

public class HW_4 {
    //month가 2이고 day가 29 이상인 경우 윤년
    public static void main(String[] args) {
        int month = 2;
        int day = 29;
        if((month == 2) && (day >= 29)){
            System.out.println("윤년입니다");
        }
        else{
            System.out.println("윤년이 아닙니다");
        }

    }
}
