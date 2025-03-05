import java.util.*;

public class EligibleVoteFunction {
    public static String EligibleVoteFunction(int age){
        String status;

        if (age > 18){
            status = "Eligible to Vote";
        }else{
            status = "Not";
        }

        return status;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("A person of age " + age + " is " +EligibleVoteFunction(age));
    }
}
