package ex02;

public class hw_2 {
    public static void main(String[] args) {
        int a=1;
        double b=1.1;
        //double과 float의 차이 float는 4바이트(32bit) double은 8바이트(64bit), 즉 double이 더 정밀하게 표현할 때 사용된다.
        String c="c";
        boolean d=true;
        System.out.printf("정수형 변수: %d \n실수형 변수: %.1f\n문자열 변수: %s \n논리형 변수: %b",a,b,c,d);
    }
}
