
package sanskritiadditionalskill;

import java.util.Scanner;
public class Program13 {
    public static void main(String args[]){
        Scanner ob =new Scanner(System.in);
        String s1=ob.nextLine();
        String s2=ob.nextLine();
        int a= s1.compareTo(s2);
        if(a>0)
            System.out.println("s1 is greater "+a);
        else if(a<0)
            System.out.println("s2 is greater " +a);
        else
            System.out.println("both are equal");
    }
}
