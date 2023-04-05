package ex07;

class myInteger {
    int num = 0;

    @Override
    public String toString() {
        return Integer.toString(num);
    }
}

public class hw_1 {
    // 전위 연산자
    public static int preIncrease(myInteger num) {
        num.num += 1;
        return num.num;
    }

    // 후위 연산자
    public static int postIncrease(myInteger num) {
        int copy = num.num;
        num.num += 1;
        return copy;
    }
    // 실행 코드
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
}
