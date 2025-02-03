import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //insert at index 0
        sb.insert(0, "S"); 
        System.out.println(sb);

        //insert at index 2
        sb.insert(3, "n"); 
        System.out.println(sb);

        //set char at indes 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
