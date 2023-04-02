package ex02;

public class hw_3 {
    public static void main(String[] args) {
       // short s1= 1, short s2= 2, short s3 = s1+s2
    }
}

/*
 오류 발생
 java: incompatible types: possible lossy conversion from int to short
 short형은 연산시 int형으로 변환된다.
 따라서 "short s3 = (short)s1+s2;" 식으로 형변환을 해주어야 한다.
*/
