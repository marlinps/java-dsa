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
