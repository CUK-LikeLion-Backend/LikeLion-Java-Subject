package ex03;

public class hw_3 {
    public static double calcArea(int radius){
        return radius*radius*3.14;
    }
    public static void main(String[] args) {
        System.out.printf("원의 넓이는 %f",calcArea(3));
    }
}
