package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeSet1_1
{
	public static void main(String args[])
	{
		Set<String> words = null; /* words adalah variabel dengan tipe interface Set dan Set akan berisi sekumpulan data 
									 dengan tipe class String */
		Iterator<String> wordIterator = null; /* deklarasi variabel dengan tipe Iterator<String> */
		int count = 1;
		
		/* 	instansiasi object dari class HashSet<String> 
			object ditampung di variable dengan tipe interface Set<String>
		*/
		words = new HashSet<String>();
		words.add("satu"); /* menambah String "satu" ke dalam Set dengan menggunakan method add */
		words.add("dua"); /* menambah String "dua" ke dalam Set dengan menggunakan method add */
		words.add("dua"); /* menambah String "dua" ke dalam Set dengan menggunakan method add */
		words.add("tiga"); /* menambah String "tiga" ke dalam Set dengan menggunakan method add */
		
		// Cara 1 [start]
		/* mengakses elemen yang ada dalam Set */
		wordIterator = words.iterator();
		System.out.println("Informasi Set setelah proses pertama");
		System.out.println("Jumlah elemen dalam Set -> " + words.size());
		while (wordIterator.hasNext())
		{
			System.out.println("Elemen ke-" + count + ": " + wordIterator.next());
			count++;
		}
		// Cara 1 [end]
		
		// Cara 2 [start]
        /* mengakses elemen yang ada dalam Set */
        /*for (String nilaiWord : words)
        {
        	System.out.println("Elemen ke-"+count+": " + nilaiWord);
            count++;
        }*/
        // Cara 2 [end]

		words.add("empat"); /* menambah String "empat" ke dalam Set dengan menggunakan method add */
		words.add("lima"); /* menambah String "lima" ke dalam Set dengan menggunakan method add */
		words.add("enam"); /* menambah String "enam" ke dalam Set dengan menggunakan method add */

		// menghapus element dengan nilai "enam"
		//words.clear();
		//words.removeAll(words);
		words.remove("enam");
		
		/* mengakses elemen yang ada dalam Set */
		wordIterator = words.iterator();
		System.out.println("\nInformasi Set setelah proses kedua");
		System.out.println("Jumlah elemen dalam Set -> " + words.size());
		count = 1;
		while (wordIterator.hasNext())
		{
			System.out.println("Elemen ke-" + count + ": " + wordIterator.next());
			count++;
		}
	}
}
