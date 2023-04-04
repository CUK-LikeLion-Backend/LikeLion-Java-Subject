package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        /* short s3 = s1 + s2;*/
    }
}

/*
s1 + s2의 연산 결과과 'int' 타입으로 반환되기 때문이다.
자바에서 정수 연산을 수행할 때, 피연산자 중 하나 이상이 'int' 형이면 연산 결과 역시 'int'형으로 반환된다.
그러므로 'short' 타입 변수 s1, s2를 더한 결과는 'int' 타입으로 반환되고, 이를 'short' 타입 변수 s3에 대입하려 하면 오류가 발생한다.
따라서, 'short s1 = 1; short s2 = 2'라고 변수를 먼저 선언한 다음, 'short s3 = (short)(s1 + s2)'와 같이 형변환을 수행해줘야 한다.
 */