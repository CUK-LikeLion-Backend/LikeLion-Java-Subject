package ex05;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        switch (score/10){//정수형 값으로 1의자리 날림
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default: //case가 들어가지 않음에 주의
                System.out.println("D");
                break;
        }
    }
}
