
package sanskritiadditionalskill;
   import java.util.*;
public class Program5 {
 

    public static void main(String args[]){
        
    Scanner ob =new Scanner(System.in);
    String s =ob.nextLine();int v=0;
    s=s.toUpperCase();
    s=s+" ";
    for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch==' ')
            v++;
    }
    System.out.println("Total no. of words = "+v);
    
}
    
}
