package ex03;

public class hw_4 {

    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {12,34,45,21,33,4};
        int result = sum(arr);
        System.out.println(result);
    }
}