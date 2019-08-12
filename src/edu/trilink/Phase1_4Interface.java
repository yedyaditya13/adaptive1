package edu.trilink;

import java.util.*;

public interface Phase1_4Interface
{
	
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);

		double number1;
		double number2;
		
		Phase1_4Imp matematikaImpl = new Phase1_4Imp();
		System.out.print("Masukkan Bilangan 1 : ");
		number1=input.nextDouble();
		System.out.print("Masukkan Bilangan 2 : ");
		number2=input.nextDouble();
		System.out.println(number1+" + "+number2+" = "+matematikaImpl.plus(number1,number2));
		
		
	}
}