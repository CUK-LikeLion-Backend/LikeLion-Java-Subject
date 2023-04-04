package ex03;

public class hw_4 {
    public static int sum(int[] arr){
        int i;
        int sum=0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.printf("%d",sum(arr));
    }
}
