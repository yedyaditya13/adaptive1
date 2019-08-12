package ujian;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.text.*;
import java.util.*;
import model.Data;

public class Ujian1Fix
{
	private static List<Data> data =null;
	
	Iterator<Data> dataIterator = null;
	
	private static Scanner input = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nik=null ;
	private String nama=null ;
	private Date tglLahir;
	
	private String strDate =null;
	private float ipk;
	private String strIpk;
	private int peringkat;
	private String strPeringkat;

	

	
	//data = new ArrayList<Data>(); 

	public static void main(String[] args)
	{
		data = new ArrayList<Data>();
		Ujian1Fix ujian = new Ujian1Fix();
		ujian.Login();
	
			
	}

	public void Login()
	{	
		String username=null;
		String password=null;
		String sandiUsername="1";
		String sandiPassword="1";

		boolean valid=true;
		
		System.out.println("\n");
		System.out.println("==============LOGIN================");
		System.out.println("\n");

		while(valid)
		{
			System.out.print("Username : ");
			username=input.nextLine();
			System.out.print("Password : ");
			password=input.nextLine();
			if (sandiUsername.equals(username) && sandiPassword.equals(password))
			{
				System.out.println("Berhasil Login");
				System.out.println("\n");
				System.out.println("===============MENU==============");
				Menu();
				valid = false;
				break;
			}
			else
			{
				System.out.println("Username dan Password Salah");
				System.out.println("Gagal Login");
				System.out.println("\n");
				valid = true;
			}
		}

	}

	public void Menu()
	{
			
		int pilih;
		String strPilih;
		System.out.println("\n");
		

		System.out.println("Daftar Operasi : ");
		System.out.println("1. Tampilkan Semua Data");
		System.out.println("2. Tambah Data");
		System.out.println("3. Ubah Data");
		System.out.println("4. Hapus Data");
		System.out.println("5. Keluar");

		
		
		boolean validOperasi=true;
	while(validOperasi)		
	{
		try
		{
			System.out.print("Silahkan pilih operasi : ");
		//pilih = input.nextInt();
			strPilih = input.nextLine();
			pilih = Integer.parseInt(strPilih);

			switch(pilih)
			{
			case 1 :TampilData(); 
					break;
			case 2 : TambahData(); break;
			case 3 : UbahData(); break;
			case 4 : HapusData(); break;
			case 5 : Keluar(); break;

			}
			validOperasi=false;
		}
		catch(Exception e)
		{
			System.out.println("Inputan Harus angka");
			validOperasi=true;
			
		}
		//break;		

	}
}

	public void TambahData()
	{
		 
		System.out.println("\n===============TAMBAH DATA==============");
		System.out.println("\n");
		boolean valid=true;
		int jlhIndex=4;
		int i=0;
		boolean validasiNik=true;
		while(i<jlhIndex)
		{
			
		
			while(validasiNik)
				{
					System.out.print("NIK : ");
					nik = input.nextLine();	
					
						try
						{
							if (nik.length() >=1 && nik.length()<=10)
							{	
								validasiNik =false;
								break;
							}
							else
							{
								System.out.println("Maksimal Inputan 10 Karakter");
								validasiNik=true;
							}
						}
						catch(Exception e)
						{
							System.out.println("Harus angka dan huruf");
						}	
					}
	
			
			System.out.print("Nama : ");
			nama = input.nextLine();

			sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Tanggal Lahir : ");
			strDate =  input.nextLine();
			
			tglLahir = new Date();
			try
			{
				tglLahir = sdf.parse(strDate);
				System.out.println("Berhasil");
				
			}
			catch(ParseException e)
			{
				System.out.println("Tanggal lahir harus dalam format dd/MM/yyyy !!!");

			}
			
			System.out.print("Peringkat : ");
			strPeringkat = input.nextLine();
			peringkat= Integer.parseInt(strPeringkat);
			System.out.print("Nilai Rata-Rata : ");
			strIpk = input.nextLine();
			ipk = Float.parseFloat(strIpk);
			
			i++;

			Data dt = new Data();
			dt.setNik(nik);
			dt.setNama(nama);
			dt.setTglLahir(tglLahir);
			dt.setPeringkat(peringkat);
			dt.setIpk(ipk);
						
			data.add(dt);	
			System.out.print("Berhasil Menambah Data!!!");
			break;
		}
		
		System.out.println("\n\nKembali Ke Menu : ");
		System.out.println("1. Tampilkan Semua Data");
		System.out.println("2. Tambah Data");
		System.out.print("Silahkan Pilih Operasi : ");
		String strPilih = input.nextLine();
		int pilih = Integer.parseInt(strPilih);

		switch(pilih)
		{
			case 1 : TampilData(); break;
			case 2 : TambahData(); break;
		}

	
}


	public void TampilData()
	{
		boolean ketemu=true;
		System.out.println("\n\n==========================DATA PELAJAR==========================\n");
								
		System.out.format("%-8s%-12s%-16s%-16s%-8s\n",
		"NIK",
		"Nama",
		"Tanggal Lahir",
		"Peringkat",
		"IPK");
		System.out.println("================================================================");
		
		for (Data dataTampil : data)
			{
						
				System.out.format("%-8s%-12s%-16s%-16s%-8s\n",
				dataTampil.getNik(),
				dataTampil.getNama(),
				sdf.format(dataTampil.getTglLahir()),
				dataTampil.getPeringkat(),
				dataTampil.getIpk());

				ketemu =false;
			}

			Menu();
		
	}

	public void UbahData()
	{
		boolean ketemu=false;
		System.out.println("\n\n==========================DATA PELAJAR==========================\n");
		System.out.format("%-8s%-12s%-16s%-16s%-8s\n",
		"NIK",
		"Nama",
		"Tanggal Lahir",
		"Peringkat",
		"IPK");
		System.out.println("================================================================");

		while(!ketemu)
		{
				for (Data dataTampil : data)
				{
								
					System.out.format("%-8s%-12s%-16s%-16s%-8s\n",
					dataTampil.getNik(),
					dataTampil.getNama(),
					sdf.format(dataTampil.getTglLahir()),
					dataTampil.getPeringkat(),
					dataTampil.getIpk());

					ketemu =true;
				}
				if(!ketemu)
				{
					System.out.println("\n\n==========================UBAH DATA==========================\n");

					System.out.println("Data Masik Kosong");

					System.out.println("\n\nKembali Ke Menu :");
					System.out.println("1. Awal");		
					System.out.print(" Silahkan Pilih OPerasi : ");		
					String strPilih = input.nextLine();
					int pilih = Integer.parseInt(strPilih);

					switch(pilih)
					{
						case 1 : System.out.println("\n\n==========================MENU==========================\n");
								 Menu(); 
								 break;
					
					}
				}				
				
		}
				System.out.println("\nInput Data yang ingin diubah :");		
				System.out.print("NIK : ");		
				String strSearch=input.nextLine();
				boolean ketemuData=false;
				Data dt = null;
				for (Data dataTampil : data)
				{
					if (dataTampil.getNik().equals(strSearch))
						{
							dt = new Data();
							dt.setNik(dataTampil.getNik());
							dt.setNama(dataTampil.getNama());
							dt.setTglLahir(dataTampil.getTglLahir());
							dt.setPeringkat(dataTampil.getPeringkat());
							dt.setIpk(dataTampil.getIpk());
							data.remove(dataTampil);
							//System.out.println("Data NIK "+strSearch+" ada");
							ketemuData=true;
							break;
						}
						else
						{
							ketemuData=false;
						}
				}
					if (ketemuData)
					{
							
						System.out.print("Nama : "+ dt.getNama()+" --> ");
						nama = input.nextLine();

						sdf = new SimpleDateFormat("dd/MM/yyyy");
						System.out.print("Tanggal Lahir : "+ dt.getTglLahir()+" --> ");
						strDate =  input.nextLine();
						
						tglLahir = new Date();
						try
						{
							tglLahir = sdf.parse(strDate);
							System.out.println("Berhasil");
							
						}
						catch(ParseException e)
						{
							System.out.println("Tanggal lahir harus dalam format dd/MM/yyyy !!!");

						}
				
						System.out.print("Peringkat : "+ dt.getPeringkat()+" --> ");
						strPeringkat = input.nextLine();
						peringkat= Integer.parseInt(strPeringkat);
						System.out.print("NIlai Rata2 : "+ dt.getIpk()+" --> ");
						strIpk = input.nextLine();
						ipk = Float.parseFloat(strIpk);
						
					
						dt.setNama(nama);
						dt.setTglLahir(tglLahir);
						dt.setPeringkat(peringkat);
						dt.setIpk(ipk);
						
						data.add(dt);
												
						System.out.print("Berhasil Merubah Data");
						//TampilData();
						System.out.println("\n\nKembali Ke Menu : ");
						System.out.println("1. Tampilkan Semua Data");
						System.out.println("2. Ubah Data");
						System.out.print("Silahkan Pilih Operasi : ");
						String strPilih = input.nextLine();
						int pilih = Integer.parseInt(strPilih);

						switch(pilih)
						{
							case 1 : TampilData(); break;
							case 2 : UbahData(); break;
						}

							
							
					}
					else
					{
						System.out.println("Data NIK "+strSearch+" Tidak ada");

						System.out.println("\n\nKembali Ke Menu :");
						System.out.println("1. Ubah Data");				
						System.out.println("2. Awal");		
						System.out.print(" Silahkan Pilih OPerasi : ");		
						String strPilih = input.nextLine();
						int pilih = Integer.parseInt(strPilih);

						switch(pilih)
						{	
							case 1 : UbahData(); 
									 break;
							case 2 : System.out.println("\n\n==========================MENU==========================\n");
									 Menu(); 
									 break;
						}

					}
					Menu();	

	}

	
	public void HapusData()
	{
		int i=0;
		int jlhIndex;
		jlhIndex=data.size();
		String hapus;
		boolean ketemu=false;
		
			System.out.print("NIK : ");
			hapus=input.nextLine();

			for (Data dtHapus : data)
					//Data dtHapus = new Data();
					{
						if (dtHapus.getNik().equals(hapus))
						{
							data.remove(dtHapus);
							System.out.println("Berhasil Hapus");				
							ketemu=true;
							break;
						}
					}
						
			if (!ketemu)
			{
				System.out.println("Data tidak ditemukan");
			}
			
			TampilData();
		

	}

	public void Keluar()
	{
	
		System.out.println("\n================GOOD BYE===================!!!");
		System.exit(0);

	}

 
}