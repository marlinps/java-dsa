package bank;

// TODO: encapsulation
// encapsulation is the bundling of data with the methods that operate on that data into a single unit. Public, private and protected fields are not accessible outside the class
public class Bank {
    public String name;
    public String email;
    private String password;

    // Getter for private field
    public String getPassword(){
        return this.password;
    }

    // Setter for private field
    private void setPassword(String password){
        this.password = password; 
    }

    public static void main(String[] args) {
        Bank account1 = new Bank();
        account1.name = "customer"; // Accessing public field
        account1.email = "email"; // Accessing protected field
        //account1.password = "password"; // Cannot access private field from outside the class
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }
}
