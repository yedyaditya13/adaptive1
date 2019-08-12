package advance.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import advance.model.Soal2;

public class LatihanCollectionSoal
{
	public static void main(String[] args)
	{
		LatihanCollectionSoal lat = new LatihanCollectionSoal();
		lat.run();
		
	}
	
	public void run()
	{
		Scanner input = new Scanner (System.in);
		List<Soal2> soals=null;
		Iterator<Soal2> soalIterator=null;
		soals = new ArrayList<Soal2>();
		
		String strJawab1;
		String strJawab2;
		String strJawab3;
		String strJawab4;
		String strJawab5;
		boolean jawaban = true;
		char jawab;
		int index = 0;
		
		
		
		System.out.println("\n");
		System.out.println("1. Yang bukan merupakan tipe date composite adalah ....");
		System.out.format("%-18s%-8s\n%-18s%-16s\n",
		"A. IMAGES",
		"C. CHAR",
		"B. DATE TIME",
		"D. ENUMERASI");
		
		System.out.print("Pilih jawaban dari [A-D] : ");
		strJawab1 = input.nextLine();
		jawab = input.next().charAt(0);
		
	/*	while(jawaban)
		{
			System.out.print("Pilih jawaban dari [A-D] : ");
			strJawab1 = input.nextLine();
			try
			{
				//jawab = Character.parseChar(strJawab1);
				jawab = strJawab1.charAt(0);
				//jawaban = true;
				//System.out.println("Konversi Berhasil");
			}
			catch(Exception e)
			{
				System.out.println("Jawaban Harus [A-D]");
				break;
			}
			
		
			
		}*/
		
		//for (int i = 0; )
		
		
		
		System.out.println("\n");
		System.out.println("2. Penjumlahan 3+4 ....");
		System.out.format("%-18s%-8s\n%-18s%-16s\n",
		"A. 4",
		"C. 6",
		"B. 7",
		"D. 8");
		
		System.out.print("Pilih jawaban dari [A-D] : ");
		strJawab2 = input.nextLine();
		
		System.out.println("\n");
		System.out.println("3. Pengurangan 7-4 ....");
		System.out.format("%-18s%-8s\n%-18s%-16s\n",
		"A. 4",
		"C. 3",
		"B. 7",
		"D. 8");
		
		System.out.print("Pilih jawaban dari [A-D] : ");
		strJawab3 = input.nextLine();
		
		System.out.println("\n");
		System.out.println("4. Perkalian 3*4 ....");
		System.out.format("%-18s%-8s\n%-18s%-16s\n",
		"A. 12",
		"C. 6",
		"B. 7",
		"D. 8");
		
		System.out.print("Pilih jawaban dari [A-D] : ");
		strJawab4 = input.nextLine();
		
		System.out.println("\n");
		System.out.println("5. Pembagian 12:4 ....");
		System.out.format("%-18s%-8s\n%-18s%-16s\n",
		"A. 4",
		"C. 6",
		"B. 7",
		"D. 3");
		
		System.out.print("Pilih jawaban dari [A-D] : ");
		strJawab5 = input.nextLine();
		
		Soal2 soal =  new Soal2();
		soal.
	}
}