public class QueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1; // inisialisasi

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1; // jika rear -1 berarti queue kosong
        }

        // add
        public static void add(int data){
            if(rear == size-1){// jika rear sudah mencapai ukuran array, berarti queue penuh
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // dequeue - 0(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        // peek
        public static int peek(){
              if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6); // should print "full queue"
        // 1 2 3 .....

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

/* TODO: Queue Using Array
 * Implement a queue using an array with methods to add, remove, and peek elements.
 * Ensure that the queue handles overflow and underflow conditions appropriately.
 * The queue should support basic operations like enqueue, dequeue, and checking if it is empty.
 * The implementation should also handle the case where the queue is full or empty.
 * Consider edge cases such as adding to a full queue or removing from an empty queue.
 * The queue should be able to store integers and should print the elements in the order they were added.
 * The main method should demonstrate the functionality of the queue by adding elements, removing them,
 * and printing the elements in the order they were added.
 */