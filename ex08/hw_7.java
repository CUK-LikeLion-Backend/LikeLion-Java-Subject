package ex08;

import java.util.Scanner;
public class hw_7 {
    public static void main(String[] args) {
        int num;

        System.out.println("정수 입력: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        toBinary(num);

    }

    public static void toBinary(int n) {

        if(n > 1)
            toBinary(n/2);

        System.out.print(n % 2);


    }
}
