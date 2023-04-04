package ex08;

import java.util.Scanner;

public class hw_5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println(ChangetoString(num));
        }
        static String ChangetoString(int num){
            return Integer.toString(num);
        }
    }

