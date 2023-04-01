package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        short s3 = (short)(s1 + s2);
    }
}

/*
Java에서 short 자료형은 2바이트 크기의 정수형 자료형입니다.
short 변수 s1과 s2에 각각 1과 2를 할당하였습니다.
그리고 s1과 s2를 더하여 결과를 short 변수 s3에 할당하려고 하였습니다.

하지만 이 코드는 컴파일 오류가 발생합니다.
이유는 Java에서 정수형 기본 자료형은 int형이기 때문에
이들을 더한 결과인 int 자료형 값이 short 자료형에 대입될 수 없기 때문입니다.
즉, 정수의 덧셈 결과는 int가 되는데, 이를 short에 할당하려면 명시적인 형 변환이 필요합니다.

따라서, s3 변수에 값을 할당할 때 다음과 같이 명시적인 형 변환을 수행하여야 합니다.
 */