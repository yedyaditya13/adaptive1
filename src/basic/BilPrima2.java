package basic;

import java.util.*;

public class BilPrima2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		int bil;
		boolean prima = true;
		int temp=0;
		
		System.out.println("\n");
		System.out.println("========================================");
		System.out.println("Aplikasi Deteksi Bilangan Prima");
		System.out.println("========================================");
		System.out.print("Masukkan Angka : ");
		bil = input.nextInt();
		
		for (int i=1;i<bil; i++)
		{
			
			if (bil%i==0){temp = temp+1;}
			
		}
		
		if (temp==1)
		{
			System.out.println("Angka "+bil+" adalah bilangan PRIMA!!!");
		}
		else
		{
			System.out.println("Angka "+bil+" adalah bukan bilangan PRIMA!!!");
		}
		
		
	}
}