package ex06;

public class hw_5 {
    public static void main(String[] args) {
        int size = 5;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = size - 1; i > 0; i--) {
            for(int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = i * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
