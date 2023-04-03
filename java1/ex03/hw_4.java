package java1.ex03;

import java.util.Scanner;
public class hw_4 {
    public static int getSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 100};
        System.out.println("arr의 합은 " + getSum(arr));
    }
}
