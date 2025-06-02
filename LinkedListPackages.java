import java.util.*;

public class LinkedListPackages {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        list.add("last"); // list.add is default method to add at the end
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        list.remove(4); // remove element at index 2
        System.out.println(list);
    }
}

/* TODO: 
 * LinkedLists is a data structure that consists of nodes, where each node contains a value and a reference to the next node in the sequence.
 * It allows for efficient insertion and deletion of elements, as well as dynamic resizing.
 *  Output:
 * [is, a]
    [this, is, a, list, last]
    5
    this -> is -> a -> list -> last -> NULL
    [this, is, a, list]
 * 
 */