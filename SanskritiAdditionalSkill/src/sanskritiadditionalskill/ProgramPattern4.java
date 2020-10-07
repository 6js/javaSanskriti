
package sanskritiadditionalskill;

public class ProgramPattern4 {
    public static void main(String args[]){
        String s="JAVA";
        
        for(int i=0;i<=s.length();i++){
            
          System.out.print(s.substring(i));
          if(i==0)
          {
              System.out.println();
              continue;
          }
          System.out.println((s.substring(0,i)).toLowerCase());
    }
}
}
