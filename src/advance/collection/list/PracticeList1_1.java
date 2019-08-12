package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeList1_1
{
	public static void main(String args[])
	{
		List<String> words = null; /* words adalah variabel dengan tipe List dan List akan berisi sekumpulan data 
									  dengan tipe class String */
		Iterator<String> wordIterator = null; /* deklarasi variabel dengan tipe Iterator<String> */
		int count = 1;
		
		words = new ArrayList<String>(); 
		words.add("satu"); /* menambah String "satu" ke dalam List dengan menggunakan method add */
        words.add("dua"); /* menambah String "dua" ke dalam List dengan menggunakan method add */
        words.add("tiga");
        words.add("empat");

		/* mengakses elemen yang ada dalam List */
		System.out.println("Informasi List setelah proses pertama");
		System.out.println("Jumlah elemen dalam List -> " + words.size());
		wordIterator = words.iterator();
		while (wordIterator.hasNext())
		{
			System.out.println("Elemen ke-" + count + ": " + wordIterator.next());
			count++;
		}

		words.add("lima"); /* menambah String "lima" ke dalam List dengan menggunakan method add */
	    words.add("enam");  /* menambah String "enam" ke dalam List dengan menggunakan method add */
	    words.add("tujuh");

	    // menghapus element dengan nilai "satu"
        words.remove("satu");

        // menghapus element di index ke 0
        //words.remove(0);

        // menyelipkan element di index ke 0
        words.add(0, "satu yang baru");
		// menyelipkan element di index ke 1
        words.add(1, "dua yang baru");
		
	    
		/* mengakses elemen yang ada dalam List */
		System.out.println("\nInformasi List setelah proses kedua");
		System.out.println("Jumlah elemen dalam List -> " + words.size());
		for (int i=0; i<words.size(); i++)
		{
			System.out.println("Elemen ke-" + (i+1) + ": " + words.get(i));
		}
		
		// Cara lain
		/*count = 1;
		while (wordIterator.hasNext())
	    {
			System.out.println("Elemen ke-"+count+": " + wordIterator.next());
		    count++;
	    }*/
		
	}
}







