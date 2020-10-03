
package sanskritiadditionalskill;

import java.util.Scanner;
public class Program10 {
    public static void main(String args[]){
    
    
    Scanner ob =new Scanner(System.in);
    String s=ob.nextLine();
    String s1="";
    for(int i=0;i<s.length();i++){
    if(s.charAt(i)==' '){
        s1=s1+s.substring(i-1);break;
    }
    }
    System.out.println("New Substring = "+s1);
 }   
}
