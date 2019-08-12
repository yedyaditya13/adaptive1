package basic;

import java.util.*;

public class BilPrima
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		int bil;
		boolean prima = true;
		int temp;
		
		System.out.println("\n");
		System.out.println("===============================");
		System.out.println("Aplikasi Deteksi Bilangan Prima");
		System.out.println("================================");
		System.out.print("Masukkan Angka : ");
		bil = input.nextInt();
		temp = bil;
		if (bil%2==1 && (bil%3)!=0)
		{
	
			System.out.println("Angka "+bil+" adalah bilangan PRIMA!!!");
		}
		
		else
		{
			System.out.println("Angka "+bil+" adalah bukan bilangan PRIMA!!!");
		}
		
		
		
	}
}