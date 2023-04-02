package ex04;

import java.util.Scanner;
public class hw_3 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            int num1= scan.nextInt();
            int num2=scan.nextInt();
            
            if(num1%3==0){
                System.out.println("3의 배수입니다");}

            if(num2%4==0){
            System.out.println("4의 배수입니다");}

        }
}
