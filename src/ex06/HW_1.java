package ex06;

public class HW_1 {
    //1부터 10까지의 합
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<11){
            sum+=i;
            i++;
        }
        System.out.printf("sum : %d",sum);
    }

}
