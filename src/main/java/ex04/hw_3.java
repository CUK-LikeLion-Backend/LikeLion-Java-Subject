package ex04;

public class hw_3 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;
        if (num1 % 3 == 0 && num2 % 4 == 0) {
            System.out.println("num1은 3의 배수이며, num2는 4의 배수입니다.");
        } else {
            System.out.println("num1과 num2 중 적어도 하나는 해당 조건을 만족하지 않습니다.");
        }
    }
}
