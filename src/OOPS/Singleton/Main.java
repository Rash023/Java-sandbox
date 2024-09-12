package OOPS.Singleton;

public class Main {
    public static void main(String[] args) {
        singleton obj1=singleton.getInstance();
        System.out.println(obj1.num);
    }

}