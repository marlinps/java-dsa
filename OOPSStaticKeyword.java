class Student {
   String name;  
   public static String school; 

   public static void changeSchool(){
         school = "Newschool";
   }
}

public class OOPSStaticKeyword {
    public static void main(String[] args) {
       Student.school = "JMV";
       Student s1 = new Student();
      
       s1.name = "Tony";
      
       System.out.println(s1.school);       
       System.out.println(Student.school);
    } 
}

/* TODO: 
 * 
   * The static keyword in Java is used to indicate that a member (variable or method) belongs to the class itself rather than to instances of the class.
   *  It allows for shared data and methods that can be accessed without creating an instance of the class.
   *  1. Static variables are shared among all instances of a class, meaning they have the same value for all objects.
   *  2. Static methods can be called without creating an instance of the class, and they can only access static variables and methods.
   *  3. Static blocks are used for static initialization of a class and are executed when the class is loaded.
   *   Example of Static Variables and Methods:
   *  In the above code, the `school` variable is static, meaning it is shared among all instances of the `Student` class. The `changeSchool` method is also static, allowing it to modify the static variable without needing an instance of the class.
   *   Example of Static Block:
   *   Static blocks can be used to initialize static variables or perform any setup required when the class is loaded. They are executed in the order they appear in the code, and only once per class loading.
   *  *  The static keyword is commonly used for constants, utility methods, and shared resources in Java applications.
   *  *  Static members can be accessed using the class name, and they do not require an instance of the class to be accessed.
   *  *  Static members are loaded into memory when the class is loaded, and they remain in memory for the lifetime of the application.
 * 
 */
