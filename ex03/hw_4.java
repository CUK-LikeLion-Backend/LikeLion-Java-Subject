package ex03;

import java.util.Scanner;

public class hw_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 개수 입력 : ");
        int number = sc.nextInt();

        System.out.println("더할 정수 입력");
        int [] arr = new int[number];
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }
    static int sum(int [] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}
