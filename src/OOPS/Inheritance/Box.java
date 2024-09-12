package OOPS.Inheritance;

public class Box {
    double l;
    double h;
    double w;


    public Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //cube
    public  Box(double side) {
        this.w = side;
        this.h = side;
        this.l = side;

    }

    //copy constructor
    public  Box(Box b){
        this.w=b.w;
        this.l=b.l;
        this.h=b.h;
    }

    public void Information(){
        System.out.println("Running the box");
    }
}
