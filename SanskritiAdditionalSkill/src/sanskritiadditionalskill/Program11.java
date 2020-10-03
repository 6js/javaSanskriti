
package sanskritiadditionalskill;

import java.util.Scanner;
public class Program11 {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=ob.nextLine();int i;
        for( i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='a'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| ch=='o'|| ch=='O'|| ch=='u'|| ch=='U'){
                break;
            }
        }
        System.out.println("New substring = "+s.substring(i)+s.substring(0,i)+"ay");
    }
}
