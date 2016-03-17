
 

package assignment2_10528808;


    

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author Mawutor
 */
public class FlipAgain 
{
    public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
                    System.out.println("Would you like to flip(y/n)");
		String again=input.next();

		while ( again.equals("y") )
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = input.next();
		}
}}
