package OOPS.AbstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age){
        this.age=age;
        VALUE=1345;
    }
    abstract void career(String name);
    abstract void partner(String name,int age);

}
