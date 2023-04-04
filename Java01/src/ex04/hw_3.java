package ex04;

public class hw_3 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 15;
        num2 = 8;
        if (num1 % 3 == 0 && num2 % 4 == 0)
            System.out.printf("%d은(는) 3의 배수이고, %d은(는) 4의 배수입니다.", num1, num2);
        else if (num1 % 3 == 0 && num2 % 4 != 0)
            System.out.printf("%d은(는) 3의 배수이고, %d은(는) 4의 배수가 아닙니다.", num1, num2);
        else if (num1 % 3 != 0 && num2 % 4 == 0)
            System.out.printf("%d은(는) 3의 배수가 아니고, %d은(는) 4의 배수입니다.", num1, num2);
        else
            System.out.printf("%d은(는) 3의 배수가 아니고, %d은(는) 4의 배수가 아닙니다.", num1, num2);
    }
}
