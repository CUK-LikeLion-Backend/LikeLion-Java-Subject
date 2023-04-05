package ex06;

public class hw_1 {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        while(true){
            if(i>10)
                break;
            sum += i++;
        }
        System.out.println("sum = " + sum);
    }
}
