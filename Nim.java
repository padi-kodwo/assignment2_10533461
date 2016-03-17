/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10528808;

import java.util.Scanner;

/**
 *
 * @author Mawutor
 */
public class Nim 
{
    public static void main(String[] arg)
    {
           
      Scanner input =new Scanner(System.in); 
     
        //String alter[] = new String [2];
         System.out.print("Player1:");
    String p1=input.next();
      System.out.print("Player2:");
       String p2=input.next();
           
      int A=3,B=4,C=5,n;
      String q;
     int tries=0;
      
      System.out.printf("A:%d  B:%d C:%d %n ",A,B,C);
      while(A>=0 && B>=0 && C>=0  )
              {
                   tries++;
                   
                  if(tries%2==0)
                  {
                      System.out.printf("%s your turn",p1);
                  }
                  else
                  {
                      System.out.printf("%s your turn",p2);
                  }
                  
       System.out.printf(" %nChoose a Pile:%n");
       q=input.next();
       
        System.out.printf("%nHow many to remove from pile:");
     n=input.nextInt();
      if(q.equals ("A"))
      {
          A=A-n;
          
           System.out.printf("A:%d  B:%d C:%d  ",A,B,C);
           
      }
      else if(q.equals ("B"))
      {
          B=B-n;
           System.out.printf("A:%d  B:%d C:%d  ",A,B,C);
       
      }
      else if(q.equals ("C"))
      {
          C=C-n;
           System.out.printf("A:%d  B:%d C:%d  ",A,B,C);
          
      }
      if (A==0 && B==0 && C==0 || A<0 && B==0 && C==0 ||A==0 && B<0 && C==0 ||A==0 && B==0 && C<0 ||A<0 && B<0 && C==0
              ||A<0 && B<0 && C<0 ||A<0 && B==0 && C<0)
      {
          System.out.println("End of game");
          break;
      }
    }
      if(tries%2==0)
                  {
                      System.out.printf("%s you win",p2);
                  }
                  else
                  {
                      System.out.printf("%s you win",p1);
                  }
    }
    }


