
package sanskritiadditionalskill;
import java.util.Scanner;
public class Program20 {
    public static void main(String args[]){
        Scanner ob =new Scanner(System.in);
        String s=ob.nextLine();
        s=s+" ";
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ')
                s1=s1+ch;
            else
            {
               if(s1.length()>5)
                   System.out.println(s1);
               s1="";
            }
            
            
        }
    }
}
