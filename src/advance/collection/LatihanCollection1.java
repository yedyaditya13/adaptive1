package advance.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import advance.model.Soal;

public class LatihanCollection1
{
	List<Soal> listSoal = new ArrayList<Soal>();
	
	private String[] jawaban = new String[5];
    private int benar;
    private int row = 5;
    private int randIndex = 0;
	
	public static void main(String args[])
    {
		LatihanCollection1 obj = new LatihanCollection1();
        obj.Start();
    }
	
	private void Start()
	{
		Soal soal = new Soal();
		soal.setSoal("Yang bukan merupakan tipe data composite adalah ...");
		soal.setJawabanA("A. Images");
		soal.setJawabanB("B. Date Time");
		soal.setJawabanC("C. Character");
		soal.setJawabanD("D. Enumerasi");
		soal.setHasil("C");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Identifier adalah ...");
		soal.setJawabanA("A. Tipe Data");
		soal.setJawabanB("B. Variabel");
		soal.setJawabanC("C. Nama");
		soal.setJawabanD("D. Nilai");
		soal.setHasil("B");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Nama lain dari flow chart adalah ...");
		soal.setJawabanA("A. Algoritma");
		soal.setJawabanB("B. Alur");
		soal.setJawabanC("C. Bagan Alir");
		soal.setJawabanD("D. Tree");
		soal.setHasil("C");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Tipe data yang dapat menampung banyak data dengan tipe data berbeda-beda adalah tipe data ...");
		soal.setJawabanA("A. Array");
		soal.setJawabanB("B. String");
		soal.setJawabanC("C. Record");
		soal.setJawabanD("D. Subrange");
		soal.setHasil("C");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Urutan langkah-langkah logis untuk menyelesaikan masalah yang disusun secara sistematis disebut ...");
		soal.setJawabanA("A. Algoritma");
		soal.setJawabanB("B. Flowchart");
		soal.setJawabanC("C. Variabel");
		soal.setJawabanD("D. Tipe Data");
		soal.setHasil("B");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Apa singkatan dari OOP ...");
		soal.setJawabanA("A. Object Oriented Programming");
		soal.setJawabanB("B. Object Oriented Page");
		soal.setJawabanC("C. Object Oriented Progres");
		soal.setJawabanD("D. Semua salah");
		soal.setHasil("A");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Pertanyaan ke 7 ...");
		soal.setJawabanA("A. Jawaban A");
		soal.setJawabanB("B. Jawaban B");
		soal.setJawabanC("C. Jawaban C");
		soal.setJawabanD("D. Jawaban D");
		soal.setHasil("A");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Pertanyaan ke 8 ...");
		soal.setJawabanA("A. Jawaban A");
		soal.setJawabanB("B. Jawaban B");
		soal.setJawabanC("C. Jawaban C");
		soal.setJawabanD("D. Jawaban D");
		soal.setHasil("B");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Pertanyaan ke 9 ...");
		soal.setJawabanA("A. Jawaban A");
		soal.setJawabanB("B. Jawaban B");
		soal.setJawabanC("C. Jawaban C");
		soal.setJawabanD("D. Jawaban D");
		soal.setHasil("C");
		listSoal.add(soal);
		
		soal = new Soal();
		soal.setSoal("Pertanyaan ke 10 ...");
		soal.setJawabanA("A. Jawaban A");
		soal.setJawabanB("B. Jawaban B");
		soal.setJawabanC("C. Jawaban C");
		soal.setJawabanD("D. Jawaban D");
		soal.setHasil("D");
		listSoal.add(soal);
		
		System.out.format("%50s\n\n",
						  "Latihan Quiz"); 
		
		for (int i = 0; i < row; i++)
        {
			Random rand = new Random();
			randIndex = rand.nextInt(listSoal.size());
			
			soal = listSoal.get(randIndex);
			
			System.out.format("%s. %s\n%-36s%s\n%-36s%s\n",
							  i+1,
							  soal.getSoal(),
							  soal.getJawabanA(),
							  soal.getJawabanB(),
							  soal.getJawabanC(),
							  soal.getJawabanD());
			
			ValidasiJawaban(i, "Pilih Jawaban dari [A-D] : ");
			
			listSoal.remove(randIndex);
			
			System.out.println("");
        }
		
		System.out.println("Jumlah Jawaban Benar : " + benar);
		System.out.println("Jumlah Jawaban Salah : " + (5 - benar));
		
		int total = (benar * 20);

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
        boolean isValid = false;
        String str = null;
        while (!isValid)
        {
        	System.out.print(pertanyaan);
        	Scanner scan = new Scanner(System.in);
        	str = scan.nextLine().toUpperCase();
            try
            {
                if (str == null || str.isEmpty())
                {
                	System.out.println("Jawaban Tidak Boleh Kosong");
                    isValid = false;
                }
                else
                {
                    if (str.equals("A") || str.equals("B") || str.equals("C") || str.equals("D"))
                    {
                        isValid = true;
                        jawaban[i] = str;
                        System.out.println("\t(" + ValidasiJawabanBenarDanSalah(i) + ")");
                    }
                    else
                    {
                        isValid = false;
                        System.out.println("Jawaban Harus [A-D]");
                    }
                }
            }
            catch (NumberFormatException ex)
            {
            	System.out.println("Jawaban Harus 1 Karakter");
                isValid = false;
            }
        }
    }
	
	public String ValidasiJawabanBenarDanSalah(int i)
    {
        String str = "Salah";
        if (jawaban[i].equals(listSoal.get(randIndex).getHasil()))
        {
            str = "Benar";
            benar++;
        }
        return str;
    }
}







