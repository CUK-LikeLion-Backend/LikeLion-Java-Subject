package ex06;

public class hw_3 {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%dx%d = %d", i, j, i * j);
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
