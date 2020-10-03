
package sanskritiadditionalskill;

import java.util.Scanner;

public class Program17 {
    public static void main(String args[]){
        
    Scanner ob =new Scanner(System.in);
    String s=ob.nextLine();String s1="";
    for(int i=0;i<s.length();i++){
        if(i%2==0)
            s1=s1+Character.toLowerCase(s.charAt(i));
        else
           s1=s1+Character.toUpperCase(s.charAt(i)); 
    }
    System.out.println("New String = "+s1);
}
}
