package ex07;
class myInteger{
    int num=0;
}
public class hw_1 {

    public static int preIncrease(myInteger my) {
        return ++my.num;
    }
    public static int postIncrease(myInteger my) {
        return my.num++;
    }

    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();

        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);  //기존 코드에 있던 그냥 b로는 함수 자체를 출력해야 하는 게 아닌지??
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");
    }

}
