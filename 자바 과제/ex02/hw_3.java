package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1= 1;
        short s2= 2;
        // short s3 = s1 + s2;

        // 오류나는 이유: short 자료형은 2바이트인데 더하면 할당 메모리의 크기를 넘는다.
        // 따라서 short 타입을 int 타입으로 바꿔줘야 한다.
    }
}
