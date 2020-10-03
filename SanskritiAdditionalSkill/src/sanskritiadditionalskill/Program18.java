
package sanskritiadditionalskill;
import java.util.Scanner;
public class Program18 {
    public static void main(String args[]){
        Scanner ob= new Scanner(System.in);
        String s=ob.nextLine();
        s=s.toLowerCase();int f;
        for(char c='a';c<='z';c++){
            f=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==c && ch!=' ')
                    f++;
            }
            if(f>0)
            System.out.println("Frequency of "+c+" is "+f);
        }
    }
}
