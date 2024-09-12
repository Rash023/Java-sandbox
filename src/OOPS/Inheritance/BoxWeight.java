package OOPS.Inheritance;

public class BoxWeight extends  Box{
    double weight;

    public BoxWeight(double weight) {
        this.weight= weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
}
