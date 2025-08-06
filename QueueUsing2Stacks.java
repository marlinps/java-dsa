import java.util.*;

import java.util.Stack;

public class QueueUsing2Stacks {

    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // enqueue - O(n)
        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // dequeue - O(1)
        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // peek - O(1)
        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
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


/* TODO: Implement Queue using 2 stacks
You can test the QueueUsing2stacks functionality here
This is a placeholder for the QueueUsing2stacks class.
The actual implementation will involve using two stacks to simulate the behavior of a queue.
You can use Stack<Integer> for the stacks and implement enqueue and dequeue operations accordingly.
The enqueue operation will push elements onto the first stack, and the dequeue operation will pop elements from the second stack,
transferring elements from the first stack to the second stack when necessary to maintain the queue order.
Remember to handle edge cases like empty queues and stack underflows.*/ T


