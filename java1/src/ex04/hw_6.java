package ex04;
// int형 배열 arr을 선언하고, 값 {1, 2, 3, 4, 5}를 할당한 후 배열의 모든 요소를 출력하는 프로그램을 작성하세요.
public class hw_6 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
