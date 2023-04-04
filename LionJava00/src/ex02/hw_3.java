package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1= 1, s2= 2;
        int s3 = s1 + s2 ;
    }
    /*Java에서는 작은 정수 타입ㅇ니 byte, short, char 타입의 연산 결과는 int 타입으로 자동 변환된다.
    이것은 작은 정수 타입의 연산 결과가 int 타입을 초과 할 수 있기 때문이다. 따라서 short 타입인 s1 과 s2를 더하면,
    두 값의 합은 int 타입으로 자동 변환된다.
    이걸 short 타입에 넣으려니 오류가 뜨는 것*/

}
