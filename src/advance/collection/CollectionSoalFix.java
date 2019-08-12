package advance.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.*;

import advance.model.Soal2;
//import advance.model.Kuis;

public class CollectionSoalFix
{
		Scanner input = new Scanner (System.in);
		List<Soal2> soalArrayList = new ArrayList<Soal2>();
		Iterator<Soal2> soalIterator=null;
	 //   soalArrayList = new ArrayList<Soal2>();
	//	Random rand = new Random();
	 
		/*String soal=null;
		String jawaban1=null;
		String jawaban2=null;
		String jawaban3=null;
		String jawaban4=null;*/
		String kunciJawaban=null;
		int jlhBenar=0;
		int jlhSalah=0;
		char grade;
		int numberOfElements=3;
	
	public static void main(String[] args)
	{
		CollectionSoalFix lat = new CollectionSoalFix();
		
		lat.setSoalJawaban();
		lat.tampilLayar();
		
	}
	
	public void setSoalJawaban()
	{
		Soal2 soal = new Soal2();
		soal.setSoal("Yang bukan merupakan tipe data....");
		soal.setJawaban1("A. Int");
		soal.setJawaban2("B. Float");
		soal.setJawaban3("C. Void");
		soal.setJawaban4("D. String");
		soal.setKunciJawaban("C");
		
		soalArrayList.add(soal);
		//Collections.shuffle(soal);
		
		soal = new Soal2();
		soal.setSoal("Yang merupakan bahasa pemograman.......");
		soal.setJawaban1("A. Java");
		soal.setJawaban2("B. Jawa");
		soal.setJawaban3("C. Aceh");
		soal.setJawaban4("D. Indonesia");
		soal.setKunciJawaban("A");
		soalArrayList.add(soal);
		
		soal = new Soal2();
		soal.setSoal("Yang merupakan huruf...");
		soal.setJawaban1("A. Saya");
		soal.setJawaban2("B. Kata");
		soal.setJawaban3("C. F");
		soal.setJawaban4("D. Tidak");
		soal.setKunciJawaban("C");
		soalArrayList.add(soal);
		
		soal = new Soal2();
		soal.setSoal("Yang bukan nama hari.....");
		soal.setJawaban1("A. Senin");
		soal.setJawaban2("B. Selasa");
		soal.setJawaban3("C. Rabu");
		soal.setJawaban4("D. Januari");
		soal.setKunciJawaban("D");
		soalArrayList.add(soal);
		
		soal = new Soal2();
		soal.setSoal("Yang merupakan nama bulan..... ");
		soal.setJawaban1("A. Senin");
		soal.setJawaban2("B. Selasa");
		soal.setJawaban3("C. Januari");
		soal.setJawaban4("D. Minggu");
		soal.setKunciJawaban("C");
		soalArrayList.add(soal);

		soal = new Soal2();
		soal.setSoal("Yang merupakan perkalian ..... ");
		soal.setJawaban1("A. 4 + 3");
		soal.setJawaban2("B. 3 - 3");
		soal.setJawaban3("C. 2 / 4");
		soal.setJawaban4("D. 1 x 4");
		soal.setKunciJawaban("D");
		soalArrayList.add(soal);
		
		Collections.shuffle(soalArrayList);
		
	}
	
	public void tampilLayar()
	{
		boolean tampilSoal = true;
		int index=0;
		for(Soal2 sl : soalArrayList)
		{
					
			System.out.println("\n");
			System.out.println((index+1)+". "+sl.getSoal());
			System.out.format("%-18s%-8s\n%-18s%-16s\n",
					sl.getJawaban1(),
					sl.getJawaban2(),
					sl.getJawaban3(),
					sl.getJawaban4());
			
			index++;
			boolean valid = true;
			while(valid)
			{
				System.out.print("Pilih jawaban dari [A-D] : ");
				kunciJawaban=input.nextLine();
				if (kunciJawaban.toUpperCase().equals("A") || kunciJawaban.toUpperCase().equals("B") || kunciJawaban.toUpperCase().equals("C") || kunciJawaban.toUpperCase().equals("D"))
				{
					//Soal2 s = new Soal2());
					
					if (kunciJawaban.toUpperCase().equals(sl.getKunciJawaban()))
					//if (kunciJawaban.toUpperCase().equals("C"))
					{
						System.out.println("<Jawaban Benar!!!>");
						jlhBenar++;
						//valid = false;
					}
					else
					{
						System.out.println("<Jawaban Salah!!!>");
						//valid=false;
						jlhSalah++;
						//break;
					}
					
					valid = false;
				}
				else
				{
					System.out.println("Harus berada diantara[A-D] : ");
				}
				
			}
				
		}
				
		System.out.println("\n");
		if (jlhBenar>=4)
		{
			grade='A';
		}
		else if (jlhBenar >= 3 && jlhBenar < 4)
		{
			grade='B';
		}
		else if(jlhBenar>=2 && jlhBenar<3)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		
		System.out.println("Jumlah Jawaban Benar : "+jlhBenar);	
		System.out.println("Jumlah Jawaban Salah : "+jlhSalah);	
		System.out.println("Jumlah Jawaban Grade : "+grade);	
			
				
		
	}
	

}