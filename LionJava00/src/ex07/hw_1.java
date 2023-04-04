package ex07;
import java.util.* ;
class myInteger {
    int num = 0;
    // toString 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 object 클래스에 정의돈 메서드이다.
    @Override  // 메서드를 오버라이딩 하는 것임을 나타내는 애노테이션.
    public String toString() {
        return String.valueOf(num);
    }
}
public class hw_1 {
    // 전위 증가 연산자 함수
    public static int preIncrease(myInteger num) {
        num.num += 1 ;
        return num.num ;
    }
    // 후위 증가 연산자 함수
    public static int postIncrease(myInteger num) {
        int t = num.num ;
        num.num += 1 ;
        return t ;
    }
    // 실행 코드
    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();
        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");
    }
}
