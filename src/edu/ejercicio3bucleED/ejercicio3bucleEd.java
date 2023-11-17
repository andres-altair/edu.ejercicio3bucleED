package edu.ejercicio3bucleED;

import java.util.Scanner;

public class ejercicio3bucleEd 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = 100 * (int) Math.random();
		int b;
		System.out.println("escribe un numero entre 0 y 100");
		int elegido =scan.nextInt();
		for (int i = 1; i < 11 ; i++) 
		{
			if ( elegido < a ) {System.out.println("es mayor");}
			else if ( elegido > a ) {System.out.println("es menor");}
			else (a == elegido){System.out.println("Acertastes");}
			 b = 1+b;
			System.out.println("acertastes en  " + b + "  veces");
		}
	}
}
