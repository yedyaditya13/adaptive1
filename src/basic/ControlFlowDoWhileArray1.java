package basic;

import java.util.*;

public class ControlFlowDoWhileArray1   //NAMA HARI TERBALIK
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String inputNama[] =  new String[7];
		int noIndex = 0;
		System.out.println("Aplikasi Mengetahui Urut Dan Nama Hari Terbalik");
		System.out.println("==============================");
		
		
		System.out.print("Masukkan nama hari 1 :");
		inputNama[0] = input.nextLine();
		
		
		System.out.print("Masukkan nama hari 2 :");
		inputNama[1] = input.nextLine();
		
		System.out.print("Masukkan nama hari 3 :");
		inputNama[2] = input.nextLine();
		
		System.out.print("Masukkan nama hari 4 :");
		inputNama[3] = input.nextLine();
		
		System.out.print("Masukkan nama hari 5 :");
		inputNama[4] = input.nextLine();
		
		System.out.print("Masukkan nama hari 6 :");
		inputNama[5] = input.nextLine();
		
		System.out.print("Masukkan nama hari 7 :");
		inputNama[6] = input.nextLine();
		
		noIndex = inputNama.length;
		System.out.println("\n");
		System.out.println("=================");
		System.out.println("Urutan Terbalik : ");
		System.out.println("=================");
		
		noIndex = noIndex - 1;
		
		do
		{
			System.out.println("Hari Ke "+ (noIndex+1) +" = "+inputNama[noIndex]);
			noIndex--;
		}
		while(noIndex >= 0);
		
			
	}
	
	
}