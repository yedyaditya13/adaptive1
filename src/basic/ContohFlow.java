package basic;

import java.util.Scanner;

public class ContohFlow
{

	public static void main(String[] args)
	{


		Scanner scan = new Scanner(System.in);
		String strNilai = null;   //nilai awal ditentukan
		
		//float nilaiUjian;  //tanpa ditentukan nilai awal
		//char nilaiSks;		//tanpa ditentukan nilai awal
		
		float nilaiUjian = 0;		//nilai awal ditentukan
		char nilaiSks = '\u0000';	//nilai awal ditentukan


		System.out.print("Nilai Ujian : ");
		strNilai = scan.nextLine();
		nilaiUjian = Float.parseFloat(strNilai);  //parsing nilai dari var nilaiUjian ke string strNilai

		if(nilaiUjian <=50){ nilaiSks = 'E'; }

		else if(nilaiUjian <=60){ nilaiSks = 'D';}
	  
		else if(nilaiUjian <=70){ nilaiSks = 'C';}

		else if(nilaiUjian <=80){ nilaiSks = 'B';}
		
		else{ nilaiSks = 'A'; }

		System.out.println("Nilai sks: " + nilaiSks); 
	}

    
}
    




