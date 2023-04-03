package ex03;

import java.util.Scanner;

public class hw_4 {
    public static int sum(int[]arr) { //메소드에 배열을 매개변수로 할 경우
        int sum=0;

        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("배열에 넣을 정수 5개를 입력하시오. ");

        int []arr=new int[5]; //입력받을 정수 5개가 들어갈 크기가 5인 배열 생성
        for (int i=0;i<5;i++){
            arr[i]=scanner.nextInt();//입력받는 값을 배열에 넣기
        }

        int result2=sum(arr); //sum함수 사용
        System.out.println(result2);
    }
}
