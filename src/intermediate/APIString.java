package intermediate;

public class APIString
{
	public static void main (String args[])
	{
		System.out.println("API String Constructor");
		
		String s = "String Test";
		System.out.println("API String s : "+s);
		
		//ubah ke integer
		//s ="Ayam";
		s = "5";
		Integer i = Integer.parseInt(s);
		System.out.println("Integer i : "+i);
		//System.out.println("Kata awal : "+s);
		
		//ubah ke huruf besar atau kecil
		s = s.toUpperCase();
		System.out.println("UpperCase : "+s);
		s = s.toLowerCase();
		System.out.println("LowerCase : "+s);
		
		
		//perbandingan antar class
		
		if (s.equals("kucing"))
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
		//ubah dari tipe integer ke string
		s = String.valueOf(i);
		System.out.println("String s ke Integer i : "+s);
		s = i.toString();
		System.out.println("String s ke Integer i : "+s);
		
		//menggabungkan 2 buah string
		String pertama = "Dedy";
		String kedua = "Situmorang";
		String username =  pertama + " " +kedua;
		username = pertama.concat(" ").concat(kedua);
		System.out.println("Username : "+username);
		
		//mengganti karakter dengan karakter lainnya
		String label = "Nasi Goreng";
		label = label.replace("Goreng","Goreng Bang Abdul");
		System.out.println("Kata yang sudah diganti : "+label);
		
		//mengecek sebuah string
		boolean b = label.contains("Goreng");
		System.out.println("Apakah ada kata Goreng? : "+b);
		
		//split string sesuai dengan karakter yang kita masukkan
		String[] splitArr = label.split("Bang");
		System.out.println("Split Array[0] : "+splitArr[0]);
		
		//mengambil karakter tertentu dengan substring
		String ss = label.substring(12,21);
		System.out.println("Substring 1 dari ss adalah : "+ss );
		ss = label.substring(6);
		System.out.println("Substring 2 dari ss adalah : "+ss );
		System.out.println("Split Array[1] : "+splitArr[1]);
		
		//untuk menghilangkan spasi dalam string
		String spasi = "               testing spasi 1";
		//spasi = spasi.trim(spasi);
		spasi = spasi.trim();
		System.out.println("Spasi hilang menjadi : "+spasi.replaceAll("\\s",""));
		//System.out.println("Spasi hilang menjadi : "+spasi);
		
		
		//untuk mengecek kata akhir dari sebuah string
		String str1 = new String ("Ini sebuah String");
		String str2 = new String ("Ini sebuah Kata");
		boolean var1 =str1.endsWith("String");
		boolean var2 =str1.endsWith("Kata");
		boolean var3 =str2.endsWith("String");
		boolean var4 =str2.endsWith("Kata");
		
		System.out.println("str1 ends with string : "+var1);
		System.out.println("str1 ends with kata : "+var2);
		System.out.println("str2 ends with string : "+var3);
		System.out.println("str2 ends with kata : "+var4);
		
		
		//index karakter dari string
		str1 = new String ("Disini ada training java");
		System.out.println("Index t dari str1 adalah : "+str1.indexOf('t'));
		//mengambiil sebuah karakter dari index
		System.out.println("Char di no 7 adalah : " + str1.charAt(7) );
		System.out.println("Index t dari str1 adalah : "+str1.indexOf('t'));
		
	}
}