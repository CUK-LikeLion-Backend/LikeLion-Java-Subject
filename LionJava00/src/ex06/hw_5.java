package ex06;
import java.util.* ;
public class hw_5 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
        {
            for(int j=i; j<4; j++) System.out.print(" ");
            for(int j=0; j<2*i+1; j++) System.out.print("*");
            System.out.println("\n");
        }
    }
}
