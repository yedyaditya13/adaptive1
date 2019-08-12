package basic;

import java.util.*;	

public class ControlFlowForValidation
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		int umur= 0;
		boolean validUmur = true;
		System.out.print("\n");
		System.out.println("=============================");
		System.out.println("Contoh Aplikasi Validasi Umur");
		System.out.println("=============================");
		
		
		for ( validUmur=true; validUmur==true;)
		{
			System.out.print("Masukkan Umur [14 - 30] : ");
		    umur = input.nextInt();
			
			if(umur >= 14 && umur <= 30)
			{
				validUmur = false;
				//System.out.println("Anda dapat menjadi pesertaa"); 
			}
			else
			{
				System.out.println("Umur harus diantara 14 - 30!!!"); 
				//validUmur = false;
			}
		}
		
		if(umur >=17 )
			{
				System.out.print("Umur Kategori Dewasa!!!! ");
			}
			else
			{
				System.out.print("Umur Kategori Belum Dewasa!!!! ");
			}
		
				
	}
}