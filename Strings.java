import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your name is "+ name);

        //TODO: concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //TODO:charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
