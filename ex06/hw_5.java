package ex06;

public class hw_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            for (int j = 1; j < 4-i+2; j++){
                System.out.printf(" ");
            }
            for (int k = 1; k<i*2; k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}