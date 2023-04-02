package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        //short s3 = s1 + s2;

        //s3의 데이터 타입은 short
        //s1 + s2 를 계산할 때 자바 컴파일러는 이를 'int'형으로 형변환 하여 계산한다.
        //따라서 s1 + s2 의 결관s int형이므로 s3의 테이터 타입과 맞지 않아 오류가 발생한다.
        //이를 해결하기 위해선 (short)(s1 + s2) 와 같이 int->short로 형변환 하면 된다.
    }
}
