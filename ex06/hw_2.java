package ex06;

public class hw_2 {
    public static void main(String[] args) {
        System.out.print("1부터 10까지의 수 중 짝수 = ");

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
