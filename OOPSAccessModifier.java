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

/* TODO: Access Modifiers in Java
    * 1. public: Accessible from any other class in any package.
    * 2. protected: Accessible within the same package and subclasses in other packages.
    * 3. private: Accessible only within the class it is declared.
    * 4. default (no modifier): Accessible only within the same package.
    
 * 
 */
