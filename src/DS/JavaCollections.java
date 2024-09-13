package DS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class JavaCollections {
    public static void main(String[] args) {
        //Java collections are just like STL in c++
        //List are just like arrays but in the object form
        //the advantage of List over array in java is that there is no need to define the size predefined
        //list is dynamic in nature
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);


        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        System.out.println(l1);
        System.out.println(l1.contains(10));
        l1.remove(1);
        l1.remove(Integer.valueOf(10));
        System.out.println(l1);
        //removes all the elements which are common in both the lists (intersection)
        l2.removeAll(l1);

        //creates a union of both the lists
        l2.addAll(l1);

        //just stores the elements which are common in both the lists into l1
        l1.retainAll(l2);
        System.out.println(l2);
        System.out.println(l1);
        //removes all the elements from the list
        l2.clear();

        //gets the element at particular index
        System.out.println(l1.get(0));
        l1.set(1,100);
        System.out.println(l1);

        //gets this index of a particular value if present in the list else -1
        System.out.println(l1.indexOf(200));

        //gets the last index of the occurence of particular value if not present returns -1
        System.out.println(l2.lastIndexOf(20));

        //if you want to create a linked list you can use the same syntax as above
        //the implementation remains the now you just have extra methods which are applpicable to linked list
        List<Integer> head=new LinkedList<>();


        //creating a stack
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.empty());
    }
}
