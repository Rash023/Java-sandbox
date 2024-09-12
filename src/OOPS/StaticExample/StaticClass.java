package OOPS.StaticExample;

public class StaticClass {
    String name;
    int age;
    int salary;
    boolean married;
    static  long population=2;


    public StaticClass(String name,int age,int salary,boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        StaticClass.population+=1;
    }

}
