package ex05;

import java.util.Scanner;
// int형 변수 score를 선언하고, 값이 90 이상인 경우 "A", 80 이상인 경우 "B", 70 이상인 경우 "C",
// 그 외에는 "D"라는 학점을 출력하는 프로그램을 작성하세요.
public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요:");
        int score = sc.nextInt();
        String result;
        if(score>=90){
            result ="A";
        } else if (score>=80) {
            result ="B";
        } else if (score>=70) {
            result ="C";
        }
        else
            result="D";

        System.out.println("학점:"+result);
    }
}
