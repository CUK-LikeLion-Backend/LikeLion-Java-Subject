package ex03;

public class hw_4 {
    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int result = sum(arr);
        System.out.println("배열의 모든 요소의 합: " + result);
    }
}
