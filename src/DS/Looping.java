import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }

        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        }while(i<=n);

        //labelled loops
        outerloop:
        for(i=0;i<n;i++){
            int j=0;
            while(j<n){
                if(j>=3) break outerloop;
                System.out.println(j);
                j++;
            }
        }



    }
}
