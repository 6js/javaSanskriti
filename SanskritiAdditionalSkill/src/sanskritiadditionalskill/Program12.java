
package sanskritiadditionalskill;
import java.util.*;
public class Program12 {
    public static void main(String args[]){
      Scanner ob =new Scanner(System.in);
      String s=ob.nextLine();
      if(s.startsWith("mr."))
      System.out.println("male");
      else if(s.endsWith("Kumari") || s.startsWith("miss"))
      System.out.println("female");
      else if(s.startsWith("mrs"))
      System.out.println("married female");   
      else 
      System.out.println("Cannot determine");
    }
    
}
