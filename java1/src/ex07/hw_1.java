package ex07;
// 전위 증가 연산자랑 후위 증가 연산자와 같은 “연산자 함수” 를 작성하세요.
// 실제 전위, 후위 연산자랑 똑같은 결과가 나오도록 작성해주세요.
public class hw_1 {
    public static void main(String[] args) {
        System.out.println("전위연산자 : "+preIncrease(10)+" "+"후위연산자 : "+postIncrease(10));
    }
    public static int preIncrease(Integer num){
        int result = ++num;
        return result;
    }
    public static int postIncrease(Integer num){
        int result = num++;
        return result;

    }


}
