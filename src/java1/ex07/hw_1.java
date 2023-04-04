package java1.ex07;

public class hw_1 {
    public static void main(String[] args) {
        int a = 0;
        MyInteger b = new MyInteger();

        System.out.println(a++);
        System.out.println(MyInteger.postIncrease(b).num);
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(MyInteger.preIncrease(b).num);
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(MyInteger.postIncrease(b).num + MyInteger.postIncrease(b).num);
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(MyInteger.preIncrease(b).num + MyInteger.preIncrease(b).num);
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");
    }
}
class MyInteger {
    int num = 0;

    // 전위 증가 연산자 함수
    public static MyInteger preIncrease(MyInteger num) {
        num.num++;
        return num;
    }

    // 후위 증가 연산자 함수
    public static MyInteger postIncrease(MyInteger num) {
        MyInteger temp = new MyInteger();
        temp.num = num.num;
        num.num++;
        return temp;
    }
}
