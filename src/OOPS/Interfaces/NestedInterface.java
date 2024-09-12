package OOPS.Interfaces;

public class NestedInterface {
    public interface nest{
        boolean isOdd(int num);
    }
}

class B implements NestedInterface.nest{
    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}

