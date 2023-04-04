package ex04;

import java.util.Scanner;
public class hw_3 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        boolean isTrue;

        if((num1 % 3 == 0) && (num2 % 4 == 0)){
            isTrue = true;
        }
        else
            isTrue = false;
    }

}
