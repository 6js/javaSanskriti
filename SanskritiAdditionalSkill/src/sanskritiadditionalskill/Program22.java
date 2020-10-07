
package sanskritiadditionalskill;
import java.util.*;
public class Program22 {
    public static void main(String args[]){
        Scanner ob =new Scanner(System.in);
        String s= ob.nextLine();s=s+" ";
        String s1="";int f=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+ch;
                if( ch==s.charAt(i+1))
                    f++;
            }
            else
            {
                if(f>0)
                    System.out.println(s1);
                s1="";f=0;
            }
        }
        
    }
}
