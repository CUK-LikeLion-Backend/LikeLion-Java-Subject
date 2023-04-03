package ex03;
// double형 매개변수 radius를 받아서 원의 넓이를 계산하여 반환하는 함수 calcArea를 작성하세요.
public class hw_3 {
    public static void main(String[] args) {
        System.out.println("원의 넓이는"+calcArea(2.5)+"입니다.");
    }
    public  static  double calcArea(double radius){
        return radius*radius*3.14;
    };
}
