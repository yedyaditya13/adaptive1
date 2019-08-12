package basic;

import java.util.*;

public class ControlFlowWhileArray3
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		//String strinputNilai = null;
		//float jlhPelajaran;
		int jlhPelajaran;
		int index = 0;
		int indexHitung = 0;
		float jumlah  = 0;
		//float nilai[];
		int nilai[];
		float rataNilai = 0;
		System.out.println("===================================");
		System.out.println("Aplikasi Menghitung Nilai Rata-Rata");
		System.out.println("===================================");
		
		System.out.print("\n");
		System.out.print("Jumlah Mata Pelajaran : ");
		//jlhPelajaran =  input.nextFloat();
		jlhPelajaran =  input.nextInt();
		
		nilai = new int[jlhPelajaran];
		
		while( index <= jlhPelajaran -1 )
		{
			System.out.print("Nilai Pelajaran "+ (index+1) +" : ");
			nilai[index] = input.nextInt();
			index++;
			
		}
	
		while(indexHitung <= jlhPelajaran - 1)
		{
			jumlah =jumlah + nilai[indexHitung];
			indexHitung++;
		}
	
		rataNilai = jumlah / jlhPelajaran;
		
		System.out.print("Rata-Rata Nilai : "+ rataNilai);
	}
	
	
}