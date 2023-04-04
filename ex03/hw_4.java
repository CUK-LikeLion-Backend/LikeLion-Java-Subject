package ex03;

public class hw_4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(sum(arr));
    }

    public static int sum(int[] arr1) {
        int result = 0;

        for (int i = 0; i < arr1.length; i++) {
            result += arr1[i];
        }
        return result;

        
        //for each 사용
        
//        for(int value : arr1)
//            result += value;
//        return result;
    }
}

