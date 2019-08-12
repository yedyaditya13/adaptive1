package basic;
import java.util.*;

public class DoWhile2
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		String strHutang = null;
		int hutang= 0;
		int gaji = 0;
		boolean validHutang = false;
		boolean validGaji = false;
		System.out.print("\n");
		System.out.println("===============================");
		System.out.println("Contoh Aplikasi Validasi Hutang");
		System.out.println("===============================");
		
		
		do
		{
			System.out.print("Hutang harus [>0] : ");
		    strHutang = input.nextLine();
			
			try
			{
				hutang = Integer.parseInt(strHutang);
				if(hutang > 0 )
				{
					validHutang = true;
		
				}
				else
				{
					System.out.println("Hutang harus lebih besar dari 0"); 
				}
			
			}
			catch (Exception e)
			{
				System.out.println("Input yang anda masukan bukan bilangan");
				validHutang = false;
			}
			
			
		}
		while(!validHutang);
		
		
		
		do
		{
			System.out.print("Gaji Harus [>0] : ");
		    gaji = input.nextInt();
			
			if(gaji > 0 )
			{
				validGaji = true;
		
			}
			else
			{
				System.out.println("Gaji harus lebih besar dari 0"); 
			}
		}
		while(!validGaji);
			
		
		
		if( gaji > hutang )
			{
				int sisaGaji = gaji - hutang;
				System.out.println("Sisa Dari Gaji Untuk Melunasi Hutang : "+sisaGaji);
				System.out.println("Anda Sudah Melunasi Hutang!!!!");
			}
			else
			{
				int bayarHutang = hutang - gaji ;
				System.out.print("Anda Punya Hutang Sebesar : "+bayarHutang);
			}
		
				
	}
}