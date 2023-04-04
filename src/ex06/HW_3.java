package ex06;

public class HW_3 {
    //구구단을 출력
    public static void main(String[] args) {
        int k = 1;
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++) {
                System.out.printf("%d x %d = %d\t", i, j, (i * j));
                if (k % 9 == 0) {
                    System.out.println();
                }
                k++;
            }

        }
    }
}
