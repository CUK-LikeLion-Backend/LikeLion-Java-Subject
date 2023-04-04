package ex06;

public class hw_4 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 100) {
            if (n % 3 == 0 && n % 4 == 0) {
                System.out.printf("%d ", n);
            }
            n++;
        }
    }
}
