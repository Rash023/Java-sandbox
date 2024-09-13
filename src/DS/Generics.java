package DS;

import java.util.ArrayList;


//generic class
class GenericClass<T,E>{
    private T data;
    private E id;
    public GenericClass(T data,E id){
        this.data=data;
        this.id=id;
    }


    void get(){
        System.out.println(this.data);
        System.out.println(this.id);
    }


}
public class Generics {
    public static void main(String[] args) {
        //there are wrapper classes in java which is mainly used
        //when multithreading as we need objects and not primitive data types
        Integer a=12; //autoboxing //Integer is a wrapper class of primitive int type
        int age=a; //unboxing
        Integer convertedVal=Integer.valueOf("12");

        GenericClass <Integer,String> g1=new GenericClass<>(12,"1234");
        g1.get();
        System.out.println(getter("Rashid"));

    }

    //generic method
    static <J>  J getter(J value){
        System.out.println(value);
        return value;
    }
};

