package ex06;

public class hw_1 {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while(i < 11) {
            sum += i;
            i++;
        }

        System.out.println("1부터 10까지의 합 = " + sum);
    }
}
