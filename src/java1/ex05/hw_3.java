package java1.ex05;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        int score;
        char grade;
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score>89){
            grade = 'A';
        }
        else if (score > 79) {
            grade = 'B';
        }
        else if (score > 69){
            grade = 'C';
        }
        else{
            grade = 'D';
        }

        System.out.println("grade = " + grade);
    }
}
