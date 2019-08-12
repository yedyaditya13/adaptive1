package basic;

import java.util.*;

public class ControlFlowWhileArray2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String namaHari[] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
		
		int noIndex = 0;
		System.out.println("=================================");
		System.out.println("Aplikasi Mengelompokkan Nama Hari");
		System.out.println("=================================");
		
		System.out.print("\n");

		System.out.println("Kelompok Ganjil : ");
		while(noIndex <= 7)
		{
			
			if (noIndex % 2 == 0)
			{
				//System.out.println(namaHari[noIndex]);
				//noIndex++;
			}
			else
			{
				System.out.println(namaHari[noIndex-1]);
				noIndex++;
			}
			noIndex++;
		
		}
		
		
		System.out.print("\n");
		System.out.println("Kelompok Genap : ");
		noIndex = 0;
		
		while (noIndex < 6)
		{
			if (noIndex % 2 == 0)
			{
				System.out.println(namaHari[noIndex+1]);
				//noIndex++;
			}
			
			noIndex++;
		}
		
		
		
		
		
		
	
	}
	
	
}