package ex03;

import java.util.Scanner;

public class hw_4 {
    static int sum(int[] arr){
        int i;
        int result=0;
        for(i=0; i<arr.length; i++){
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        int result = sum(arr);
        System.out.println("result = " + result);
    }
}
