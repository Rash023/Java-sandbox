package OOPS.StaticExample;

public class StaticBlock {
    static int a=5;
    static int b;
    static {
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock s1=new StaticBlock();
        System.out.println(s1.a+" "+s1.b);
    }
}
