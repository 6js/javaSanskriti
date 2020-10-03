
package sanskritiadditionalskill;

import java.util.*;
public class Program9 {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the string ");
        String s =ob.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s1.equalsIgnoreCase(s)) {
            System.out.println(" palindrome");
        }
        else {
    System.out.println("Not palindrome");
     }
}
}