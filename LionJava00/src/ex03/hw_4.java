package ex03;

import java.util.Scanner;

public class hw_4 {
    public static int sum(int[] arr)
    {
        int res = 0 ;
        for(int i=0; i<arr.length; i++)  res += arr[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        System.out.println(sum(arr));
    }

}
