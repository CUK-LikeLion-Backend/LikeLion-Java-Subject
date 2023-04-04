package ex07;
//후위 연산자와 전위 연산자
class myInteger {
    int num = 0;
    public String toString(){
        return Integer.toString(num);
    }
}
public class HW_1 {
    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();
        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");


        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");
    }
    public static int preIncrease(myInteger num) {
        int k = ++num.num;
        return k;
    }
    public static int postIncrease(myInteger num) {
        int i = num.num++;
        return i;
    }
}

