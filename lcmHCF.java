import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn= new Scanner(System.in);
      int num1=scn.nextInt();
      int num2=scn.nextInt();
      
      int bign,smalln,hcf=0,lcm=0;
      if(num1>num2)
      {
      bign=num1;
      smalln=num2;
      }
      else
      {
      bign=num2;
      smalln=num1;
      }
      
      for(int i=1;i<smalln;i++)
      {
          if(num1 % i==0 && num2 % i==0)
          {
              hcf=i;
              
          }
          
      }
      lcm=(num1*num2)/hcf;
      
      System.out.println(hcf);
      System.out.println(lcm);
      
      
     }
    }
