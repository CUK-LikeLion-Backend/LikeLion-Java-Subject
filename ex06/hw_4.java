package ex06;

public class hw_4 {
    public static void main(String[] args) {
        int i = 1;

        System.out.print("1부터 10까지의 수 중 3과 4의 배수인 수 = ");

        while(i <= 100) {
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
            i++;
        }
    }
}
