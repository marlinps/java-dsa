import java.util.*;

public class StackInterviews2 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        // Base Case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s); // Recursive
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        // Base Case
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s); // Recursive
        pushAtBottom(top, s);
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

       reverse(s);
  
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    } 
}

/* TODO: Reverse a Stack
example
input
3
2
1

output
1
2
3
 */