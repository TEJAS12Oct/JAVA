package String;

import java.util.StringTokenizer;  
public class Simple_StringTokenizer{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is Tejas"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  