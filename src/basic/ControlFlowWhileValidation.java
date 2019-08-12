package basic;
import java.util.*;

public class ControlFlowWhileValidation
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		int umur= 0;
		boolean validUmur = false;
		System.out.print("\n");
		System.out.println("=============================");
		System.out.println("Contoh Aplikasi Validasi Umur");
		System.out.println("=============================");
		
		while(!validUmur)
		{
			System.out.print("Masukkan Umur [14 - 30] : ");
		    umur = input.nextInt();
			
			if(umur >= 14 && umur <= 30)
			{
				validUmur = true;
		
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