package ex07;

class myInteger {
    int num = 0;

    public void increase() {
        num++;
    }

    public String toString() {
        return String.valueOf(num);
    }
}
public class hw_1 {
    public static int preIncrease(myInteger num) {
        num.increase();
        return num.num;
    }

    public static int postIncrease(myInteger num) {
        int result = num.num;
        num.increase();
        return result;
    }
    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();

        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b: " + b);
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b: " + b);
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b: " + b);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b: " + b);
        System.out.println("-----");
    }
}
