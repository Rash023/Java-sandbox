package OOPS.Singleton;

public class singleton {
    int num=2;
    private singleton() {
        int num=-1;
    }

    private static singleton instance;
    public static  singleton getInstance(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;
    }
}
