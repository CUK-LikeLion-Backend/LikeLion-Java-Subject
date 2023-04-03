package ex03;

import java.util.Scanner;
public class hw_4 {
    public static int sum(int[] array){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=scan.nextInt();
        }
        System.out.println(sum(array));
    }
}
