package java8;
import java.util.function.*;

@FunctionalInterface
interface MyFunctionalInterface {
   Student getStudent(String name);
}
public class ConstructorReference {
   public static void main(String[] args) {
    
	   
	  // System.out.println(Student::new);
	   
	   
	   Function<String,Student> f = Student::new;
	   
	   f.apply("Namrata");
	   
	   fullname("Namrata","Marathe",String::concat);
	   
	   
	   ConstructorReference ob = new ConstructorReference();
	
	   fullname("Namrata","Rasmalai",ob::fav);
		   
	   
   }
   
   
   public String fav(String a,String b)
   {
	   System.out.println("Person:"+a+" likes "+b);
	   return b;
   }


   public static String fullname(String a,String b,BiFunction<String,String,String> bif)
   {
     	return bif.apply(a, b);
   }
   

}
// Student class
class Student {
   private String name;
   public Student(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   
  
}