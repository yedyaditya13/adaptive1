package basic;
import java.util.*;

public class ControlSwitchForValidation
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		String strPerseneling = null;
		int perseneling=0;							//penggunaaan case harus int
		
		//boolean validPerseneling = false;
		boolean validPerseneling = true;
		
		
		
		for(validPerseneling=true; validPerseneling==true;)
		//while(!validPerseneling)
		{
			System.out.print("Kondisi Perseneling : ");
			strPerseneling = scan.nextLine();
		
			try
			{
				perseneling = Integer.parseInt(strPerseneling);
				if( perseneling >=0 && perseneling<=4 )
				{
					validPerseneling = false;
				}
				else
				{
					System.out.println("Kondisi Perseneling Harus Berada Diantara 0 -4"); 
				}
			}
			catch(Exception e)
			{
				System.out.println("Input yang anda masukan bukan bilangan");
				//validPerseneling = false;
			}
		}
		
		switch (perseneling)
		{
			case 0 : strPerseneling = "Kendaraan Tidak Bergerak"; break;   //tidak dapat melakukan perbanding boolean
			case 1 : strPerseneling = "Kendaraan Mulai Bergerak"; break;
			case 2 : strPerseneling = "Kendaraan Kecepatan Rendah"; break;
			case 3 : strPerseneling = "Kendaraan Kecepatan Sedang"; break;
			case 4 : strPerseneling = "Kendaraan Kecepatan Tinggi"; break;
			default : strPerseneling = "Kondisi Tidak Diketahui"; break;
			
		}
		System.out.println(strPerseneling);

		
		
	
	}
}