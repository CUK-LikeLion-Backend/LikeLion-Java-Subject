package ex03;
// int형 배열 arr을 받아서 배열의 모든 요소의 합을 계산하여 반환하는 함수 sum을 작성하세요.
public class hw_4 {
    // public static int[] sum(int[] arr)이렇게 정의해서 계속 java: incompatible types: int cannot be converted to int[] 이오류가 발생
    // return을 int인 sum으로 받고싶은 거기에 int라고 해줘야한다.
    public static int sum(int[] arr){
        // 여기서 배열의 이름은 result
        int sum=0;
        for (int i=0;i<arr.length;i++){

            sum+=arr[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        // sum({1, 2, 3, 4,5 } 이렇게해서 매개변수로 보내는 것이 아니다.
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("int형 배열 원소의 합은: "+ sum(arr)+"입니다.");
    }

}
