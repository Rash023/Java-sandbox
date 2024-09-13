package DS;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //lambda expressions
        WalkAble w1=(int steps)->{
            System.out.println("Walked "+steps+" Steps");
            return steps+1;
        };

        //we can shorten the lambda expression more
        WalkAble w2=(steps)-> steps*2;



    }

}

//functional interface: it only contains one method inside the interface
//if there are more than one methods inside the interface it will not be called as an interface
interface WalkAble{
    int walks(int steps);
}