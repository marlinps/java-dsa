import java.util.*;
import bank.*; // Importing the Account class from the bank package

public class OOPSAccessModifier {
    public static void main(String[] args) {
        bank.Bank account1 = new bank.Bank();
        account1.name = "customer"; // Accessing public field from another package
        account1.email = "email"; // Accessing protected field from another package
        //account1.password = "password"; // Cannot access private field from outside the class 
    }
}
