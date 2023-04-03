package ex03;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 7};
        int sum = sum(arr);
        System.out.println("결과는 : "+sum);
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
}