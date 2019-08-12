package advance.collection.dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class PracticeDictionary1
{
	public static void main(String args[])
    {
        PracticeDictionary1 obj = new PracticeDictionary1();
        obj.Run();
    }

    private void Run()
    {
        Dictionary<Integer, String> words = null; /* words adalah variabel dengan tipe Dictionary dan Dictionary 
        											 akan berisi sekumpulan data 
        											 dengan tipe class String */
        Enumeration<String> wordIterator = null; /* deklarasi variabel dengan tipe Enumeration<String> */
        
        /* 	instansiasi object dari class Dictionary<Integer, String> 
            object ditampung di variable words dengan tipe Dictionary<Integer, String>
        */
        words = new Hashtable<Integer, String>();
        words.put(1, "Elemen Ke-1"); /* menambah String "Elemen Ke-1" ke dalam Dictionary dengan menggunakan method put */
        words.put(2, "Elemen Ke-2"); /* menambah String "Elemen Ke-2" ke dalam Dictionary dengan menggunakan method put */
        words.put(3, "Elemen Ke-3"); /* menambah String "Elemen Ke-3" ke dalam Dictionary dengan menggunakan method put */

	    /* mengakses elemen yang ada dalam Dictionary */
        wordIterator = words.elements();
	    System.out.println("Informasi Dictionary setelah proses pertama");
	    System.out.printf("Jumlah elemen dalam Dictionary -> %s\n", words.size());
	    while (wordIterator.hasMoreElements())
	    {
	    	System.out.printf("Value = %s\n", wordIterator.nextElement());
	    }

	    words.put(4, "Elemen Ke-4"); /* menambah String "Elemen Ke-4" ke dalam Dictionary dengan menggunakan method put */
	    words.put(5, "Elemen Ke-5"); /* menambah String "Elemen Ke-5" ke dalam Dictionary dengan menggunakan method put */
	    words.put(6, "Elemen Ke-6"); /* menambah String "Elemen Ke-6" ke dalam Dictionary dengan menggunakan method put */

	    // Cara 1 [start]
	    /* mengakses elemen yang ada dalam Dictionary */
	    wordIterator = words.elements();
	    System.out.println("\nInformasi Dictionary setelah proses kedua");
	    System.out.printf("Jumlah elemen dalam Dictionary -> %s\n", words.size());
	    while (wordIterator.hasMoreElements())
	    {
	    	System.out.printf("Value = %s\n", wordIterator.nextElement());
	    }
	    
	    Enumeration<Integer> wordKeysIterator = words.keys();
	    System.out.println("\nInformasi Dictionary setelah proses kedua");
	    System.out.printf("Jumlah key dalam Dictionary -> %s\n", words.size());
	    while (wordKeysIterator.hasMoreElements())
	    {
	    	System.out.printf("Key = %s\n", wordKeysIterator.nextElement());
	    }
	    // Cara 1 [end]

	    // Cara 2 [start]
	    /*for (Enumeration e = words.elements(); e.hasMoreElements();) {
	    	System.out.printf("Value = %s\n", e.nextElement());
	    }*/
	    // Cara 2 [end]
	    
	    Dictionary<String, String> wordsGet = null; /* wordsGet adalah variabel dengan tipe Dictionary dan Dictionary akan berisi sekumpulan data 
	    											   dengan tipe class String */
	    Enumeration<String> wordGetIterator = null;

	    wordsGet = new Hashtable<String, String>();
	    wordsGet.put("Satu", "Elemen Ke-7"); /* menambah String "Elemen Ke-7" ke dalam Dictionary dengan menggunakan method put */
	    wordsGet.put("Dua", "Elemen Ke-8"); /* menambah String "Elemen Ke-8" ke dalam Dictionary dengan menggunakan method put */
	    wordsGet.put("Tiga", "Elemen Ke-9"); /* menambah String "Elemen Ke-9" ke dalam Dictionary dengan menggunakan method put */
	    
	    // menghapus element Dictionary dengan key "Tiga"
        //wordsGet.remove("Tiga");
        
        /* mengakses elemen yang ada dalam Dictionary */
	    wordGetIterator = wordsGet.elements();
        System.out.printf("\nInformasi Dictionary setelah proses pertama");
        System.out.printf("Jumlah elemen dalam Dictionary -> %s\n", wordsGet.size());
        System.out.printf("Key = 'Satu', Value = %s\n", wordsGet.get("Satu"));
        System.out.printf("Key = 'Dua', Value = %s\n", wordsGet.get("Dua"));
        System.out.printf("Key = 'Tiga', Value = %s\n", wordsGet.get("Tiga"));

    }
}