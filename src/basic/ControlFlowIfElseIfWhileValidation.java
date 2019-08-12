package basic;

import java.util.Scanner;

public class ControlFlowIfElseIfWhileValidation	
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float nilai = 0;   //nilai awal ditentukan
		
		float nilaiUjian = 0;		//nilai awal ditentukan
		char nilaiSks = '\u0000';	//nilai awal ditentukan

		boolean validNilai=false;
		
		while(!validNilai)
		{
			System.out.print("Nilai Ujian : ");
			nilai = scan.nextFloat();
			
			if (nilai>=0 && nilai<=100)
			{
				validNilai = true;
			}
			else
			{
				System.out.println("Nilai Ujian Harus berada diantara 0 - 100 !!!");
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
    




