package ex05;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        int score;
        char grade;

        System.out.println("점수 입력 : ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score >= 90){
            grade = 'A';
        }
        else if ((score < 90) && (score >= 80)){
            grade = 'B';
        }
        else if ((score < 80) && (score >= 70)){
            grade = 'C';
        }
        else
            grade = 'D';

        System.out.println("학점: "+grade);
    }
}
