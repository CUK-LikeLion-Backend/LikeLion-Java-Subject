package ex02;
//- 정수형 변수를 선언하고 출력하시오.
//- 실수형 변수를 선언하고 출력하시오.
//- 문자열 변수를 선언하고 출력하시오.
//- 논리형 변수를 선언하고 출력하시오.
public class hw_2 {
    public static void main(String[] args) {
        int num1 = 1;
        // 왠만하면 실수형은 double사용하기
        // float을 사용하고자 하면 float num = 0.1f;
        double num2 = 0.1;
        String num3 = "result";
        Boolean num4 = true;

        System.out.println("정수형:"+num1+" 실수형 변수:"+num2+" 문자열변수:"+num3+" 논리형 변수"+num4);
    }
}
