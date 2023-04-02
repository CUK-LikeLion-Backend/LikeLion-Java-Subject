package ex07;

//전위 증가 연산자랑 후위 증가 연산자와 같은 “연산자 함수” 를 작성하세요.
//실제 전위, 후위 연산자랑 똑같은 결과가 나오도록 작성해주세요.
class myInteger{
    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class hw_1 {

    public static int preIncrease(myInteger num) {
        int result = num.getNum(); //result = 0
        num.setNum(++result); //result = 1
        return result;
    }

    public static int postIncrease(myInteger num){
        int result = num.getNum(); //result = 0
        num.setNum(++result); //result = 1
        return result-1; //후위연산자는 연산이 마지막에 되기 때문에 -1을 해줘야 함
    }


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

        System.out.println(a++ + ++a);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");
    }
}
