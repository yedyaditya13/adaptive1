package basic;

import java.util.*;

public class BilGanjilGenap
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		int bil;
		System.out.println("\n");
		System.out.println("========================================");
		System.out.println("Aplikasi Deteksi Bilangan Ganjil / Genap");
		System.out.println("========================================");
		System.out.print("Masukkan Angka : ");
		bil = input.nextInt();
		if (bil%2 == 0)
		{
				System.out.println("Angka "+bil+" adalah bilangan Genap!!!");
		}
		else
		{
			System.out.println("Angka "+bil+" adalah bilangan Ganjil!!!");
		}
		
		
	}
}