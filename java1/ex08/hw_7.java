package java1.ex08;

import java.util.Scanner;
public class hw_7 {
    public static String binaryString(int num){
        String ans = Integer.toBinaryString(num);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(binaryString(num));
    }
}
