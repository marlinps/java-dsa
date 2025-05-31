import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // Add elements to the ArrayList
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get an element from the ArrayList
        int element = list.get(0); // returns 0
        System.out.println(element);

        //add element in between
        list.add(1,1); // adds 1 at index 1
        System.out.println(list);

        //set an element at a specific index
        list.set(0, 5); // changes the first element to 5
        System.out.println(list);

        // remove an element from the ArrayList
        list.remove(3);
        System.out.println(list);

    }
}

/* TODO: ArrayLists
    * 1. Create an ArrayList of integers and add some elements to it.

 * 
 */
