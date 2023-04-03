package ex02;

public class hw_3 {
    public static void main(String[] args) {
        /*
        변수를 short로 선언해도 덧셈 연산을 진행할 때
        int형으로 생각하고 계산하기 때문에
        short 형인 s3에 넣으려고 하면 overflow가 발생함.
        따라서 s3을 int형으로 설정해야 함.
        */
        short s1 = 1, s2 = 2;
        int s3 = s1 + s2;
    }
}
