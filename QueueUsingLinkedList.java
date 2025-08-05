public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // enqueue - O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode; // jika queue kosong, head dan tail menunjuk ke node baru
            }

            tail.next = newNode; // tambahkan node baru di akhir
            tail = newNode; // update tail ke node baru
        }

        // dequeue - O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1; // jika queue kosong, tidak ada yang bisa dihapus
            }

            int front = head.data; // ambil data dari node head
            if (head == tail) { // jika hanya ada satu elemen
                tail = null; // kosongkan queue
            }

            head = head.next; // geser head ke node berikutnya
            return front; // kembalikan data dari node yang dihapus
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data; // kembalikan data dari node head
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
