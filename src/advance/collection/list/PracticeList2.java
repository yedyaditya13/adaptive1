package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeList2
{
	public static void main(String args[])
	{
		List<String> words = null;  
		Iterator<String> wordIterator = null; 
		int count = 1;
		
		String var1 = "Satu";
		String var2 = "Dua";
		String var3 = "Tiga";
		String var4 = "Empat";
		String var5 = "Lima";
		String var6 = "Enam";
		
		//INstansiasi objek dari class ARRAYLIST <String> objek ditampung di variabel dengna tipe interface Set<String>
		
		words =  new ArrayList<String>();
		words.add(var1); 
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
		
		
		words.add(var4); 
		words.add(var5);
		words.add(var6);
		
		//mengakses elemen yg ada dalam LIST
		wordIterator=words.iterator();
		System.out.println("Informasi LIST setelah proses kedua");
		System.out.println("Jumlah elemen dalam LIST --> "+words.size());
		count = 1;
		
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
	}
}