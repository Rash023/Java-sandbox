public class ConditionalStatements {
    public static void main(String[] args) {
        int age=18;
        if(age>=18){
            System.out.println("User is a citizen");
        }
        else if(age>10 && age<18) System.out.println("User is a teenager");
        else{
            System.out.println("User is not a citizens");
        }

        //ternary operator
        int a=12;
        int b=23;
        int max=a>b?a:b;

        System.out.println(max);

        //switch case in java
        int val=1;
        switch (val){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Invalid value");
        }


    }
}
