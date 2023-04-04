package ex07;

public class hw_1 {
    public static int preIncrease(Integer num){
        Integer li=new Integer(num);
        num=li.intValue();
        return ++num;
    }
    public static int postIncrease(Integer num){
        Integer li=new Integer(num);
        num=li.intValue();
        return num++;
    }
    public static void main(String[] args) {
        Integer a = 0;
        System.out.println(postIncrease(a));
        a = 0;
        System.out.println(a++);
        a = 0;
        System.out.println(++a);
        a = 0;
        System.out.println(preIncrease(a));
    }
}
