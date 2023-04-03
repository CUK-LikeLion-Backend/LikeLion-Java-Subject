package ex04;
// int형 변수 x와 y를 선언하고, 값을 5와 3으로 초기화한 후, x와 y의 곱과 몫을 출력하는 프로그램을 작성하세요.
// 단, 몫은 소수점 이하를 버리고 정수값으로 출력합니다.
//  : 이미 정수형이여서 소수점 이하는 출력되지 않는다.
public class hw_4 {
    public static void main(String[] args) {
        int x,y;
        x =5;
        y=3;

        System.out.println("x와 y의 곲은 " +(x*y)+"이고 x와 y의 몫은"+(x/y)+"이다.");

    }
}
