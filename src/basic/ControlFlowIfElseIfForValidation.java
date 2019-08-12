package basic;
import java.util.Scanner;

public class ControlFlowIfElseIfForValidation	
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float nilai = 0;   //nilai awal ditentukan
		
		float nilaiUjian = 0;		//nilai awal ditentukan
		char nilaiSks = '\u0000';	//nilai awal ditentukan
		
		String strNilai=null;

		//boolean validNilai=false;
		boolean validNilai=true;
		
		for(validNilai=true; validNilai==true;)
		//while(!validNilai)
		{
			System.out.print("Nilai Ujian : ");
			strNilai = scan.nextLine();
			try
			{
				nilai = Float.parseFloat(strNilai);
				if (nilai>=0 && nilai<=100)
				{
					validNilai = false;
				}
				else
				{
					System.out.println("Nilai Ujian Harus berada diantara 0 - 100 !!!");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Nilai harus angka!!!");
				
			}
			
		}
		if(nilaiUjian <=50){ nilaiSks = 'E'; }

		else if(nilaiUjian <=60){ nilaiSks = 'D';}
	  
		else if(nilaiUjian <=70){ nilaiSks = 'C';}

		else if(nilaiUjian <=80){ nilaiSks = 'B';}
		
		else{ nilaiSks = 'A'; }

		System.out.println("Nilai SKS: " + nilaiSks); 
	}

    
}
    




