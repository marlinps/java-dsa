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

        //replace at index 0, 2
        sb.replace(0, 2, "ro");
        System.out.println(sb);

        //delete at extra 'n'
        sb.delete(3,5);
        System.out.println(sb);

        //set char at indes 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //reverse string
        sb.reverse();
        System.out.println(sb);

        //capacity
        int cap = sb.capacity();
        System.out.println(cap);

        //length
        int len = sb.length();
        System.out.println(len);

        //substring
        String sub = sb.substring(0,3);
        System.out.println(sub);

    }
}
