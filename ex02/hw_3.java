package ex02;

public class hw_3 {
    /*
    short s1 = 1;
    short s2 = 2;
    short s3 = s1 + s2;
     */

    short s1 = 1;
    short s2 = 2;
    short s3 = (short) (s1 + s2); // 강제 형변환

    short s4 = 1;
    short s5 = 2;
    int s6 = s4 + s5; // 자동 형변환

}

    /* s1 + s2 = 3으로 연산 결과가 short의 범위 안에 들어오긴 하나, CPU의 데이터 처리 단위는
    int, 즉 4byte이므로 결과가 저장된 저장소의 크기 역시 4byte이기 때문에 short형의 변수에는
    값이 저장될 수 없다. 따라서 int로의 자동 형변환이나 강제 형변환을 통해 오류를 수정할 수 있다.
    */

