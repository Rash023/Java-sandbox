package OOPS;

public class Main {
    public static void main(String[] args){
        Student s1=new Student();
        System.out.println(s1.name);
        Student s2=new Student(s1);
        System.out.println(s2.name);
    }


}


class Student{
    int rno;
    String name;
    float marks;

    //default constructor
    Student(){
        this.rno=2780;
        this.name="Rashid Mazhar";
        this.marks=94;
    }
    //constructor with arguments
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    //constructor which accepts and object
    Student (Student other){
        this.rno=other.rno+1;
        this.name=other.name;
        this.marks=other.marks;
    }
    void changeName(String newName){
        this.name=newName;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
};
