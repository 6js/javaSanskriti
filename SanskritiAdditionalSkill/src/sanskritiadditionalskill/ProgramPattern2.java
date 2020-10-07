
package sanskritiadditionalskill;


public class ProgramPattern2 {
    public static void main(String args[]){
        String s="iLoveJava";
        
        for(int i=0;i<s.length();i++)
        {
            for(int k=(s.length()-1);k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            for(int l=i;l>0;l--){
                System.out.print(s.charAt(l-1));
            }
            System.out.println();
        }
    }
}
