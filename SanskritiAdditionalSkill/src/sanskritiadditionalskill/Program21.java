
package sanskritiadditionalskill;

import java.util.Scanner;
public class Program21 {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        s=s+" ";
        String s1="";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ')
                s1=s1+ch;
            else
            {
                if(isPalin(s1)==0)
                    System.out.println(s1);
                s1="";
            }
        }
        
    }
    static int isPalin(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s1.equalsIgnoreCase(s)) 
            return 0;
        return 1;
        
      
    }
}
