
package sanskritiadditionalskill;

import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the day name ");
        String s=ob.nextLine();
        int c=0;
        if(s.equalsIgnoreCase("Monday"))
            c=1;
        else if(s.equalsIgnoreCase("Tuesday"))
            c=2;
        else if(s.equalsIgnoreCase("Wednesday"))
            c=3;
        else if(s.equalsIgnoreCase("Thursday"))
            c=4;
        else if(s.equalsIgnoreCase("Friday"))
            c=5;
        else if(s.equalsIgnoreCase("Saturday"))
            c=6;
        else if(s.equalsIgnoreCase("Sunday"))
            c=7;
        else
        {
            System.out.println("Wrong day");
            System.exit(0);
        }
        System.out.println("Dya number = "+c);
    }
}
