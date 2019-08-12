package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeSet2
{
	public static void main(String args[])
	{
		Set<String> words = null;  //words adalah variabel dengan tipe interface Set dan Set akan brisi sekumpulan data dengan tipe class string
		Iterator<String> wordIterator = null; //deklarasi variabel dennga tipe Iterator<String> class untuk looping
		int count = 1;
		
		String var1 = "Satu";
		String var2 = "Dua";
		String var3 = "Tiga";
		String var4 = "Empat";
		String var5 = "Lima";
		String var6 = "Enam";
		//INstansiasi objek dari class Hashset <String> objek ditampung di variabel dengna tipe interface Set<String>
		
		words =  new HashSet<String>();
		words.add(var1); // menambah string 'satu' kedalam set dengna menggunakan method add
		words.add(var2);
		words.add(var3);
		
		//mengakses elemen yg ada dalam set
		wordIterator=words.iterator();
		System.out.println("Informasi Set setelah proses pertama");
		System.out.println("Jumlah elemen dalam set --> "+words.size());
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
		System.out.println("");
		
		
		words.add(var4); // menambah string 'satu' kedalam set dengna menggunakan method add
		words.add(var5);
		words.add(var6);
		
		//mengakses elemen yg ada dalam set
		wordIterator=words.iterator();
		System.out.println("Informasi Set setelah proses kedua");
		System.out.println("Jumlah elemen dalam set --> "+words.size());
		count = 1;
		
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
	}
}