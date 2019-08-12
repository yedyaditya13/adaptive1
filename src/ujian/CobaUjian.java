public class CobaUjian
{


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

			System.out.print("Silahkan pilih operasi : ");
			//pilih = input.nextInt();
			strPilih = input.nextLine();
			pilih = Integer.parseInt(strPilih);
			
					
			switch(pilih)
			{
				case 1 : TampilData(); break;
				case 2 : TambahData(); break;
				case 3 : UbahData(); break;
				case 4 : HapusData(); break;
				case 5 : Keluar(); break;

			}		

		}

}		