import java.util.*;

public class StackInterviews1 {
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

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);
  
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    } 
}

/* TODO: Pust at The Bottom of Stack
example

data
3
2
1

input = 4

output
3
2
1
4
 */