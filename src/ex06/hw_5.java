package ex06;
//별 찍기를 하는 프로그램을 이중 for문을 이용하여 작성하세요
public class hw_5 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
