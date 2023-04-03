package ex08;

public class hw_6 {
    public static String[] spaceBar(String str){
        return str.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(spaceBar("Hello World!")[0]);
        System.out.println(spaceBar("Hello World!")[1]);
    }
}
