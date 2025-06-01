public class LinkedLists {
    Node head; // Head of the linked list
    private int size; // Size of the linked list

    LinkedLists(){
        this.size = 0; // Initialize size to 0
    }

    class Node{
        String data;
        Node next;

        // Constructor to create a new node
        Node(String data){
            this.data = data;
            this.next = null; // Initially, the next node is null
            size++;
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

    // print the linked list
    public void printList(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next; 
        }

        System.out.println("NULL"); // Indicate the end of the list
    }

    // delete - first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        size--; // Decrease the size of the list
        head = head.next; // Move the head to the next node
    }

    // delete - last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        size--; // Decrease the size of the list
        if(head.next == null){
            head = null; // If there's only one node, set head to null
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){ 
            lastNode = lastNode.next; // Traverse to the last node
            secondlast = secondlast.next; 
        }

        secondlast.next = null; // Set the next of the second last node to null
    } 
    
    public int getSize() {
        return size; // Return the current size of the linked list
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("a");
        list.addFirst("is");   
        list.printList();

        list.addLast("list");  
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
    } 
}

/* TODO: LinkedLists is a data structure that consists of nodes, where each node contains a value and a reference to the next node in the sequence.
    * It allows for efficient insertion and deletion of elements, as well as dynamic resizing.

 * 
 */
