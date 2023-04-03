package ex06;
// while문을 이용하여 1부터 100까지의 수 중 3의 배수이면서 4의 배수인 수를 출력
public class hw_1 {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            if( i%3==0 & i%4==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
