package ex07;
class myInteger{
    int num=0;

    @Override
    public String toString(){
        return Integer.toString(num);
    }

}
public class hw_1 {

    public static int preIncrease(myInteger my) {  //myInteger 의 파라미터를 my라는 이름으로 가져온다!
       my.num+= 1;
        return my.num;
    }
    public static int postIncrease(myInteger my) {
        int origin= my.num; //기존 값 변수저장
        my.num+=1;  //증감 시켰지만
        return origin; //출력은 증감 이전의 값으로
    }

    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger(); //b는 myInteger의 객체.

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
