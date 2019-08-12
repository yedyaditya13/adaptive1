package advance.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import advance.model.SoalFix;
//import advance.model.Kuis;

public class PracticeKuis
{
		Scanner input = new Scanner (System.in);
		List<SoalFix> soalArrayList = new ArrayList<SoalFix>();
		Iterator<SoalFix> soalIterator=null;
	 //   soalArrayList = new ArrayList<SoalFix>();
	 
		String[] jawaban = new String[5];
		int jlhBenar;
		int jlhSalah;
		int row=5;
		int randIndex=0;
		String kunciJawaban=null;
	
	public static void main(String[] args)
	{
		PracticeKuis lat = new PracticeKuis();
		
		lat.setSoalJawaban();
		
		//lat.tampilLayar();
		
		//	lat.run();
		
	}
	
	public void setSoalJawaban()
	{
		
		SoalFix soal = new SoalFix();
		soal.setSoal("Yang bukan merupakan tipe data....");
		soal.setJawaban1("A. Int");
		soal.setJawaban2("B. Float");
		soal.setJawaban3("C. Void");
		soal.setJawaban4("D. String");
		soal.setKunciJawaban("C");
		
		soalArrayList.add(soal);
		
		soal = new SoalFix();
		soal.setSoal("Yang merupakan bahasa pemograman.......");
		soal.setJawaban1("A. Java");
		soal.setJawaban2("B. Jawa");
		soal.setJawaban3("C. Aceh");
		soal.setJawaban4("D. Indonesia");
		soal.setKunciJawaban("A");
		soalArrayList.add(soal);
		
		soal = new SoalFix();
		soal.setSoal("Yang merupakan huruf...");
		soal.setJawaban1("A. Saya");
		soal.setJawaban2("B. Kata");
		soal.setJawaban3("C. F");
		soal.setJawaban4("D. Tidak");
		soal.setKunciJawaban("C");
		soalArrayList.add(soal);
		
		soal = new SoalFix();
		soal.setSoal("Yang bukan nama hari.....");
		soal.setJawaban1("A. Senin");
		soal.setJawaban2("B. Selasa");
		soal.setJawaban3("C. Rabu");
		soal.setJawaban4("D. Januari");
		soal.setKunciJawaban("D");
		soalArrayList.add(soal);
		
		soal = new SoalFix();
		soal.setSoal("Yang merupakan nama bulan..... ");
		soal.setJawaban1("A. Senin");
		soal.setJawaban2("B. Selasa");
		soal.setJawaban3("C. Januari");
		soal.setJawaban4("D. Minggu");
		soal.setKunciJawaban("C");
		soalArrayList.add(soal);

		//Collections.shuffle(soalArrayList);
		System.out.format("%50s\n\n",
						  "Latihan Quiz"); 

		for (int i=0; i<row; i++)
		{
			Random rand = new Random();
			randIndex=rand.nextInt(soalArrayList.size());

			soal = soalArrayList.get(randIndex);

			System.out.println((i+1)+". "+soal.getSoal());
					System.out.format("%-18s%-8s\n%-18s%-16s\n",
							soal.getJawaban1(),
							soal.getJawaban2(),
							soal.getJawaban3(),
							soal.getJawaban4());
					

			ValidasiJawaban(i,"Pilih Jawaban dari [A-D] : ");
			soalArrayList.remove(randIndex);
			System.out.println("\n");

		}

		System.out.println("Jumlah Jawaban Benar : " + jlhBenar);
		System.out.println("Jumlah Jawaban Salah : " + (5 - jlhBenar));

		int total = (jlhBenar * 20);

		System.out.print("Anda Mendapat Grade : ");

		if (total < 40)
        {
        	System.out.println("D");
        }
        else if (total < 60)
        {
        	System.out.println("C");
        }
        else if (total < 80)
        {
        	System.out.println("B");
        }
        else System.out.println("A");
		
	}


	public void ValidasiJawaban(int i, String pertanyaan)
	{
		boolean valid=true;
		String strInput=null;
		while(valid)
		{
			System.out.print(pertanyaan);
			Scanner input = new Scanner(System.in);
			strInput=input.nextLine().toUpperCase();
			try
			{
				if(strInput==null || strInput.isEmpty())
				{
					System.out.println("Jawaban Tidak Boleh Kosong");
					valid=true;
				}
				else
				{
					if (strInput.equals("A") || strInput.equals("B") || strInput.equals("C") || strInput.equals("D"))
					{
						valid=false;
						jawaban[i]=strInput;
						System.out.println("\t(" + ValidasiJawabanBenarDanSalah(i) + ")");

					}
					else
					{
						valid=true;
						System.out.println("Jawaban Harus [A-D]");

					}
				}
			}
			catch(Exception e)
			{
				System.out.println("Jawaban Harus 1 Karakter");
				valid=true;
			}
		}
	}


	public String ValidasiJawabanBenarDanSalah(int i)
    {
        String strInput = "Salah";
        if (jawaban[i].equals(soalArrayList.get(randIndex).getKunciJawaban()))
        {
            strInput = "Benar";
            jlhBenar++;
        }
        return strInput;
    }





	//Cara 1
	/*public void tampilLayar()
	{
		
			boolean valid = true;
			int index=0;
			while(valid)
			{
				
				//while(soalIterator.hasNext())
			//{
				for(SoalFix sl : soalArrayList)
				{
					
					soalIterator = soalArrayList.iterator();
					//sl = soalIterator.next();
					System.out.println((index+1)+". "+sl.getSoal());
					System.out.format("%-18s%-8s\n%-18s%-16s\n",
							sl.getJawaban1(),
							sl.getJawaban2(),
							sl.getJawaban3(),
							sl.getJawaban4());
					System.out.println("\n");
			//}	
					System.out.print("Pilih jawaban dari [A-D] : ");
					kunciJawaban=input.nextLine();
					if (kunciJawaban.toUpperCase().equals("A") || kunciJawaban.toUpperCase().equals("B") || kunciJawaban.toUpperCase().equals("C") || kunciJawaban.toUpperCase().equals("D"))
					{
						//SoalFix s = new SoalFix());
						
						//if (kunciJawaban.toUpperCase().equals(.getKunciJawaban()))
							if (kunciJawaban.toUpperCase().equals(sl.getKunciJawaban()))
						{
							System.out.println("<Jawaban Benar!!!>");
							System.out.println("\n");
							valid = false;
						//	break;
						}
						else
						{
							System.out.println("<Jawaban Salah!!!>");
							System.out.println("\n");
							valid=true;
							//break;
						}
					}
					else
					{
						System.out.println("Harus berada diantara[A-D] : ");
						valid=true;
					}
						
				}
				
			}
				
	
	}*/
		

}