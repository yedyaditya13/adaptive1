package advance.collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;
import java.text.*;

import advance.model.Pelajar;


public class cobacoba
{
	Scanner input = new Scanner (System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args)
	{
		cobacoba coba = new cobacoba();
		coba.run();
		
	}
	public void run()
	{
		List<Pelajar> pelajar =null;
		Iterator<Pelajar>pelajarIterator=null;
		pelajar = new ArrayList<Pelajar>();
		
		
		String strJlhPelajar;
		String strNoPelajar;
		String strNama;
		String strTempatLahir;
		Date tanggalLahir;
		String strTanggalLahir;
		String strJenisKelamin;
		String strALamat;
		String strNoTelp;
		String strJurusan;
		String strCari;
		
		int jlhPelajar=0;
		
		
		System.out.print("Masukkan jumlah Pelajar : ");
		strJlhPelajar=input.nextLine();
		jlhPelajar = Integer.parseInt(strJlhPelajar);
		
		for (int i=0; i<jlhPelajar; i++)
		{
			System.out.println("Data Pelajar Ke-"+(i+1));
			System.out.print("Nomor Pelajar : ");
			strNoPelajar=input.nextLine();
			System.out.print("Nama : ");
			strNama=input.nextLine();
			System.out.print("Tempat Lahir : ");
			strTempatLahir=input.nextLine();
			
			
			System.out.print("Tanggal Lahir : ");
			strTanggalLahir=input.nextLine();
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			tanggalLahir = new Date();
			try
			{
				tanggalLahir = sdf.parse(strTanggalLahir);
			}
			catch(Exception e)
			{
				System.out.println("Harus dalam format dd/mm/yyyy");
			}
			System.out.print("Jenis Kelamin : ");
			strJenisKelamin=input.nextLine();
			System.out.print("Alamat : ");
			strALamat=input.nextLine();
			System.out.print("Nomor Telepon : ");
			strALamat=input.nextLine();
			System.out.print("Jurusan : ");
			strJurusan=input.nextLine();
			
			System.out.println("\n");
			
			Pelajar setPelajar = new Pelajar();
			setPelajar.setNoPelajar(strNoPelajar);
			setPelajar.setNama(strNama);
			setPelajar.setTempatLahir(strTempatLahir);
			setPelajar.setTanggalLahir(tanggalLahir);
			setPelajar.setJenisKelamin(strJenisKelamin);
			setPelajar.setAlamat(strALamat);
			setPelajar.setJurusan(strJurusan);
			
			
			pelajar.add(setPelajar);
		}
		
		pelajarIterator = pelajar.iterator();
		System.out.println("DATA PELAJAR");
		System.out.println("Jumlah Elemen List -->"+pelajar.size());
		System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
		"No Pel",
		"Nama",
		"Tempat Lahir",
		"Tanggal Lahir",
		"Jenis Kelamin",
		"Alamat",
		"Nomor Telephon",
		"Jurusan");
		System.out.println("===============================================================================================");
		
		
		while(pelajarIterator.hasNext())
		{
			Pelajar plj = pelajarIterator.next();
			System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
			plj.getNoPelajar(),
			plj.getNama(),
			plj.getTempatLahir(),
			sdf.format(plj.getTanggaLahir()),
			plj.getJenisKelamin(),
			plj.getAlamat(),
			plj.getNoTelp(),
			plj.getJurusan());
			
		}
		
		boolean ketemu=true;
		while(ketemu)
		{
			System.out.print("Masukkan No Pelajar : ");
			strCari=input.nextLine();
			try{
				for(Pelajar pel : pelajar)
				{
					if (pel.getNoPelajar().equals(strCari))
					{
						pelajarIterator = pelajar.iterator();
						System.out.println("DATA PELAJAR");
						System.out.println("Jumlah Elemen List -->"+pelajar.size());
						System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
						"No Pel",
						"Nama",
						"Tempat Lahir",
						"Tanggal Lahir",
						"Jenis Kelamin",
						"Alamat",
						"Nomor Telephon",
						"Jurusan");
						 System.out.println("===============================================================================================");
						
						System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
						pel.getNoPelajar(),
						pel.getNama(),
						pel.getTempatLahir(),
						sdf.format(pel.getTanggaLahir()),
						pel.getJenisKelamin(),
						pel.getAlamat(),
						pel.getNoTelp(),
						pel.getJurusan());
						
						ketemu = false;
						break;
					}
				}
				if(ketemu)
				{
					System.out.println("Tidak ada data yang ditemukan!!");
				}
				
			}
			catch(Exception e)
			{
				System.out.print("DANGER!!!!!!!!");
			}
		}
		
	}
}