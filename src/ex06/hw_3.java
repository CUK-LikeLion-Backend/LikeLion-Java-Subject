package ex06;

public class hw_3 {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<10; i++){
            System.out.println(i + "단");
            for(j=1; j<10; j++){
                System.out.println(i + " X " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
