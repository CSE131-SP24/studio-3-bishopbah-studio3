package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	System.out.println("What number do you want to go up to?");
	int n = in.nextInt();
	
	int[] sieve = new int[n+1];
	
	for (int i = 0; i < sieve.length; i++)
		// puts numbers 0 - 40 in the array
		{	
		sieve[i] = i;
		}

	
		for (int p = sieve[2]; p < sieve.length; p++)
		{
			for (int i = 2 * p; i < sieve.length; i = i + p)
		{
			sieve[i] = 0;
		}
	}
	
	for (int i = 2; i < sieve.length; i++)
	{
		if (sieve[i] != 0)
		{
			System.out.println(sieve[i]);
		}
	}
		
	}
}
