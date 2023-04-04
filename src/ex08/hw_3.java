package ex08;

public class hw_3 {
    public static void Print(){
        char alpha='a';
        int i;
        //소문자
        for(i=0;i<25;i++){
            System.out.printf("%c -> %c \n",(alpha+i),(alpha+1+i));
        }
        System.out.printf("%c -> %c \n\n",(alpha+25),alpha);
        //대문자
        alpha='A';
        for(i=0;i<25;i++){
            System.out.printf("%c -> %c \n",(alpha+i),(alpha+1+i));
        }
        System.out.printf("%c -> %c \n",(alpha+25),alpha);
    }

    public static void main(String[] args) {
        Print();
    }
}
