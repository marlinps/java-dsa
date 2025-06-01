
public class LinkedLists {
    Node head; // Head of the linked list

    class Node{
        String data;
        Node next;

        // Constructor to create a new node
        Node(String data){
            this.data = data;
            this.next = null; // Initially, the next node is null
        }
    }

    // add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head  = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next; // Traverse to the last node
        }
        currNode.next = newNode; // Link the last node to the new node
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("a");
        list.addFirst("is");

       
    } 
}

/* TODO: LinkedLists is a data structure that consists of nodes, where each node contains a value and a reference to the next node in the sequence.
    * It allows for efficient insertion and deletion of elements, as well as dynamic resizing.

 * 
 */
