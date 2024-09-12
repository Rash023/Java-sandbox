package OOPS.AbstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);

    }
    @Override
    public void career(String name){
        System.out.println("I am going to become a " +name);
    }

    @Override
    public void partner(String name,int age){
        System.out.println("I love "+name+"She is"+age);
    }
}
