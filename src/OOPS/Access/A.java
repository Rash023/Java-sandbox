package OOPS.Access;

public class A {
    private int num;
    int []arr;
    String name;

    public A(int num, String name) {
        this.num = num;
        this.arr = new int[num];
        this.name = name;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }


}
