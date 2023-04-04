package ex06;

public class hw_1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        System.out.printf("%d",sum);
    }
}
