/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanskritiadditionalskill;
import java.util.Scanner;
public class Program3 {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);int c=0;
        System.out.println("Enter the string :");
        String s1=ob.nextLine();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                c++;
            }
        }
        System.out.println("No. of capital letters= "+c);
    }
}
