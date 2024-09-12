package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight b1=new BoxWeight(1,2,3,4);
        BoxWeight b2=new BoxWeight(b1);
        System.out.println(b1.l+" "+b1.h+" "+b1.w+" "+b1.weight);

    }
}
