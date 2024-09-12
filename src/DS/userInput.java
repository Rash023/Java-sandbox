import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter you age");
        int age=sc.nextInt();
        System.out.println("Your age is:"+age);

        int firstNumber=sc.nextInt();
        long secondNumber=sc.nextLong();
        int result=(int)(firstNumber+secondNumber);
        System.out.println(result);

        //it is recommended to close the scanner class using garbage collector
        //as it will free up the memory allocated
        sc.close();
    }
}
