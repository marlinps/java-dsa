public class QueueUsingCircularArray {
    static public class Queue {
        static int arr[];
        static int size;
        static int rear = -1; // inisialisasi
        static int front = -1;


        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;

        }

        public static boolean isFull(){
            return (rear+1) %  size == front;
        }

        // enqueue - O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Full queue");
                return;
            }

            // 1st element add
            if(front == -1){
                front = 0;
            }

            rear = (rear+1) % size; // TODO: circular increment
            arr[rear] = data; // tambahkan data ke elemen berikutnya
        }

        // dequeue - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1; // jika queue kosong, tidak ada yang bisa dihapus
            }

            int result = arr[front]; // ambil elemen pertama
            if(front == rear){ // jika hanya ada satu elemen
                rear = front = -1;
            } else {
                front = (front + 1) % size; // TODO: circular increment
            }

            return result;

        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            // return the front element
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

// Output:
// 1
// 2

// 3
// 4
// 5
// 6
// 7


