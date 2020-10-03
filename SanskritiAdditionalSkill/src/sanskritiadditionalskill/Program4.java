
package sanskritiadditionalskill;
import java.util.*;
public class Program4 {
    public static void main(String args[]){
        
    Scanner ob =new Scanner(System.in);
    String s =ob.nextLine();int v=0;
    s=s.toUpperCase();
    for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch=='A' || ch=='E'||ch=='I' ||ch=='O' ||ch=='U')
            v++;
    }
    System.out.println("Vowels="+v);
    }
}
