import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String name="Rashid";
        String newName=new String("Rashid");
        String sameName="Rashid";
        String smallName="rashid";
        //when we use == operator the reference to the variable is matched and not the values
        System.out.println(name==newName);
        //when we use equals method the content of the variable is matched
        System.out.println(name.equals(newName));
        //we can use ignore case to match the string ignoring the case of the letters
        System.out.println(name.equalsIgnoreCase(smallName));


        Scanner sc= new Scanner(System.in);
        String firstName=sc.nextLine();
        //if we want every string which is between the spaces is considered as single string then we use next();
        String secondName=sc.next();
        //concatenate two strings using + operator
        System.out.println(firstName+secondName);

        //java string mehods
        //toUpperCase()
        //toLowerCase()
        //trim()
        //startsWith()
        //endsWith()
        //equals()
        //equalsIgnoreCase()
        //charAt()
        //valueOf()
        //replace()
        //contains()
        //substring()
        //split()
        //toCharArray()
        //isEmpty()

    }
}
