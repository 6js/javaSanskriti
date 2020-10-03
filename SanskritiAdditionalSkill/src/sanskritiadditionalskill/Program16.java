
package sanskritiadditionalskill;
import java.util.*;
public class Program16 {
    public static void main(String args[]){
        
    Scanner ob =new Scanner(System.in);
    String s=ob.nextLine();
     String s1=ob.nextLine();
      String s2=ob.nextLine();
       String s3=ob.nextLine();
        String s4=ob.nextLine();
        if(isVowel(s1)==0)
            System.out.println(s1);
        if(isVowel(s)==0)
            System.out.println(s);
        if(isVowel(s2)==0)
            System.out.println(s2);
        if(isVowel(s3)==0)
            System.out.println(s3);
        if(isVowel(s4)==0)
            System.out.println(s4);
        
}
    static int isVowel(String n){
        n=n.toUpperCase();
        if(n.charAt(0)=='A' || n.charAt(0)=='E' || n.charAt(0)=='I'|| n.charAt(0)=='O' || n.charAt(0)=='U')
            return 0;
        return 1;
    }
}

