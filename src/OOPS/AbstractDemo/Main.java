package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s1=new Son(12);
        s1.career("Engineer");

        Parent d1=new Daughter(13);
        d1.career("Doctor");
        System.out.println(d1.VALUE);
    }
}
