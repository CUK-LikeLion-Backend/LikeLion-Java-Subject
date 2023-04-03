package ex06;

public class hw_2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            if(i%2==0)
                sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
