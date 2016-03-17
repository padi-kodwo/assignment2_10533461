/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10528808;

/**
 *
 * @author Mawutor
 */
import java.util.Scanner;
public class CountingMachineRevised 
{
    
   
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        
        int t,v,c;
        System.out.println("Count from:");
        t=input.nextInt();
        System.out.println("Count to:");
        v=input.nextInt();
        System.out.println("Count by:");
        c=input.nextInt();
        for(int n = t;n<=v;n=n+c)
        {
            System.out.printf(n + ", ");
        }
}}


