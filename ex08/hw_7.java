package ex08;

import java.util.Scanner;
    public class hw_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            String binaryString = toBinaryString(number);
            System.out.println("Binary representation: " + binaryString);
        }

        public static String toBinaryString(int number) {
            StringBuilder sb = new StringBuilder();
            while (number > 0) {
                sb.append(number % 2); //나눈값 저장
                number /= 2;
            }
            return sb.reverse().toString(); //문자열 뒤집기
        }
    }