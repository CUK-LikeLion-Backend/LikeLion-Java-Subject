package ex07;

class myInteger {
    private int value;

    public myInteger() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public static int postIncrease(myInteger num) {
        int result = num.getValue();
        num.increase();
        return result;
    }

    public static int preIncrease(myInteger num) {
        num.increase();
        return num.getValue();
    }
}
public class hw_1 {
    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();

        System.out.println(a++);
        System.out.println(myInteger.postIncrease(b));
        System.out.println("a: " + a + " b:" + b.getValue());
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(myInteger.preIncrease(b));
        System.out.println("a: " + a + " b:" + b.getValue());
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(myInteger.postIncrease(b) + myInteger.postIncrease(b));
        System.out.println("a: " + a + " b:" + b.getValue());
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(myInteger.preIncrease(b) + myInteger.preIncrease(b));
        System.out.println("a: " + a + " b:" + b.getValue());
        System.out.println("-----");
    }
}
