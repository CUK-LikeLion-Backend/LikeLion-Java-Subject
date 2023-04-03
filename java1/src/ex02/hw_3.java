package ex02;
//오류가 발생하는지 확인하고. 이유를 서술하시오
public class hw_3 {
    public static void main(String[] args) {
        short s1 =1;
        short s2 =2;
        //short s3 = s1+s2;

        // java: incompatible types: possible lossy conversion from int to short : 이런 오류가 발생한다
        // 이 오류는 int형 값을 short형에 대입했기때문에 발생한 오류이다.
        // short형은 2바이트, int형은 4바이트때 사용하며
        // 굳이 short형을 사용하고싶다면 int로 선언한 뒤 이것을 새로운 변수명을 이용해서 short로 선언한다
        // int test = 1; short result = (short)test; 이렇게 형변환을 해서 사용
    }
}
