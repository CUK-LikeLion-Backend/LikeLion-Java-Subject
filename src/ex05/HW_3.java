package ex05;

public class HW_3 {
    public static void main(String[] args) {
        int score = 71;
        String grade = " ";
        if(score>=90){
            grade = "A";
        }
        else if(score>=80){
            grade = "B";
        }
        else if(score>=70){
            grade = "C";
        }
        else{
            grade = "D";
        }
        System.out.println(grade);

    }
}
