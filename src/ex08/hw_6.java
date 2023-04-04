package ex08;

public class hw_6 {
    public static void Split(){
        String name="Like Lion";
        String[] divName=name.split(" ");
        String name1=divName[0];
        String name2=divName[1];
        System.out.printf("%s을 %s와 %s으로 나누었다!",name,name1,name2);
    }
    public static void main(String[] args) {
        Split();
    }
}
