package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;

        //short s3 = s1 + s2;

         /*오류발생 : 두 개의 short 변수인 s1과 s2를 더한 결과는 int 타입으로 반환되기 때문이다.
            이를 short 타입인 s3에 할당할 수 없다.*/

        //아래코드로 변경
        short s3 = (short) (s1 + s2);

        System.out.printf("%d", s3);

    }
}
