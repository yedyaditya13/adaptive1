package advance.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PracticeMap1
{
	public static void main(String args[])
	{
		Map<String, String> words = null; /* deklarasi variabel dengan tipe Map<String, String> */
		Set<String> keyWords = null;
		Iterator<String> wordIterator = null; /* deklarasi variabel dengan tipe Iterator<String> */
		String keyWord = null;
		
		/* 	instansiasi object dari class HashMap<String, String> 
			object ditampung di variable dengan tipe Map<String, String>
		*/
		words = new HashMap<String, String>(); 
		words.put("satu", "1"); /* menambah value "satu" ke dalam Map dengan key "satu" */
		words.put("dua", "2"); /* menambah value "dua" ke dalam Map dengan key "dua" */
		words.put("tiga", "3"); /* menambah value "tiga" ke dalam Map dengan key "tiga" */
		
		/* mengakses elemen yang ada dalam Set */
		keyWords = words.keySet();
		wordIterator = keyWords.iterator();
		System.out.println("Informasi Map setelah proses pertama");
		System.out.println("Jumlah elemen dalam Map -> " + words.size());
		while (wordIterator.hasNext())
		{
			keyWord = wordIterator.next();
			System.out.println("Elemen dengan key: " + keyWord + " memiliki value: " + words.get(keyWord));
		}
		
		/* mengakses value dengan collection */
		/*Collection<String> wordCollection = words.values();
		for (String s : wordCollection)
		{
			System.out.println("value: " + s);
		}*/

		words.put("empat", "4"); /* menambah value "satu" ke dalam Map dengan key "empat" */
		words.put("lima", "5"); /* menambah value "satu" ke dalam Map dengan key "lima" */
		words.put("enam", "6"); /* menambah value "satu" ke dalam Map dengan key "enam" */

		/* mengakses elemen yang ada dalam Set */
		keyWords = words.keySet();
		wordIterator = keyWords.iterator();
		System.out.println("\nInformasi Map setelah proses kedua");
		System.out.println("Jumlah elemen dalam Map -> " + words.size());
		while (wordIterator.hasNext())
		{
			keyWord = wordIterator.next();
			System.out.println("Elemen dengan key: " + keyWord + " memiliki value: " + words.get(keyWord));
		}
		words.put("satu", "7");

		/* mengakses elemen yang ada dalam Set setelah element dengan id 'satu' diganti dengan '7' */
		keyWords = words.keySet();
		wordIterator = keyWords.iterator();
		while (wordIterator.hasNext())
		{
			keyWord = wordIterator.next();
			System.out.println("Elemen dengan key: " + keyWord + " memiliki value: " + words.get(keyWord));
		}
		
		System.out.println("\nMap menggunakan for");
		for(Map.Entry map : words.entrySet())
		{
			System.out.println("Elemen dengan key: " + map.getKey() + " memiliki value: " + map.getValue());
		}
		
		
		Iterator<String> key = words.keySet().iterator();
        String keyTemp = "";
        while(key.hasNext())
		{
            keyTemp = key.next();
            System.out.println("kunci : "+keyTemp+", elemen : "+words.get(keyTemp));
        }

		
	}
}
