package basic;

import java.util.*;

public class ControlFlowDoWhileArray2	//NAMA HARI KELOMPOK GANJIL GENAP
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
		
		do
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
		
		while(noIndex <= 7);
		
		
		System.out.print("\n");
		System.out.println("Kelompok Genap : ");
		noIndex = 0;
		
		do
		{
			if (noIndex % 2 == 0)
			{
				System.out.println(namaHari[noIndex+1]);
				//noIndex++;
			}
			
			noIndex++;
		}
		
		while (noIndex < 6);
		
		
	}
	
	
}