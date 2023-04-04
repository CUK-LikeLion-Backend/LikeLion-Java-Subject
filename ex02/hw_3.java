package ex02;

public class hw_3 {

    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
//        short s3 = s1+s2;

        //자바에서 short 자료형과 같은 작은 자료형은 연산 시에 int 자료형으로 자동 형 변환됨.
        // 즉, short 자료형 변수끼리의 연산은 int 자료형으로 변환된 후 연산이 수행됨.
        //따라서 short s1 = 1, short s2 = 2, short s3 = s1 + s2와 같은 코드에서 s1 + s2는 int 형으로 변환된 후에 연산이 수행되므로, 결과 값은 int 형이 됨.
        // 이렇게 연산 결과가 int 형으로 반환되기 때문에, s3에 그 값을 대입하려면 반드시 명시적인 형 변환이 필요.
        // short s3 = short (s1 + s2) 처럼 형변환 해줘야함

    }
}
