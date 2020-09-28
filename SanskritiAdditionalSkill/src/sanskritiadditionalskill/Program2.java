
package sanskritiadditionalskill;
import java.util.Scanner;
public class Program2 {
    
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter First name :");
        String s1=ob.nextLine();
        System.out.println("Enter Middle name :");
        String s2=ob.nextLine();
        System.out.println("Enter Last name :");
        String s3=ob.nextLine();
        System.out.println("Full name = "+s1+" "+s2+" "+s3+"\n"+s1.charAt(0)+"."+s2.charAt(0)+"."+s3.charAt(0)+".");
    }
}
