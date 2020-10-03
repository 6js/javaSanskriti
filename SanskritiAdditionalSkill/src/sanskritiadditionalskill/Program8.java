
package sanskritiadditionalskill;
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=ob.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                s1=s1+Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch))
                s1=s1+Character.toUpperCase(ch);
            else
                s1=s1+ch;
        }
        System.out.println("New String= "+s1);
}
}