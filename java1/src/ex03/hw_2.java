package ex03;
//  두 개의 int형 매개변수 a와 b를 받아서 더한 값을 반환하는 함수 add를 작성하세요.
// 함수 add작성 retun형은 int
public class hw_2 {
    public static void main(String[] args) {
        System.out.println("두수를 더한 값: " + add(22, 23));
    }
    public static int add( int a ,int b ) {
        int result = a +  b ;
        return result;
    };
}
