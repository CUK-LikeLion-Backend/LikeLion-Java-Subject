package ex06;

public class hw_4 {
    public static void main(String[] args) {
        int i=1;
        while(true){
            if((i%3==0)&& (i%4==0)){
                System.out.println(i);
            }
            ++i;
            if(i>100)
                break;
        }
    }
}
