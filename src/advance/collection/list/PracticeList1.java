package advance.collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class PracticeList1
{
	public static void main(String args[])
	{
		List<String> words = null;
		Iterator<String> wordIterator = null;
		int count = 1;
		
		words = new ArrayList<String>();
		
		words.add("Satu");
		words.add("Dua");
		words.add("Tiga");

		wordIterator=words.iterator();
		System.out.println("Informasi List setelah proses pertama");
		System.out.println("Jumlah elemen dalam list --> "+words.size());
	
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
		System.out.println("");
		
		
		words.add("Empat"); // menambah string 'satu' kedalam list dengna menggunakan method add
		words.add("Lima");
		words.add("Enam");
		
		//cara menghapus element dengan nilai "satu"
       // words.remove("satu");

        // cara menghapus element di index ke 0
        //words.remove(0);
		
		// cara menyelipkan element di index ke 0
	//	 words.add(0, "satu yang baru");
		
		//mengakses elemen yg ada dalam list
		wordIterator=words.iterator();
		System.out.println("Informasi List setelah proses kedua ");
		System.out.println("Jumlah elemen dalam List --> "+words.size());
		count = 1;
		//CARA KE 1
		for (int i=0; i<words.size(); i++)
		{
			System.out.println("Elemen ke-" + (i+1) + ": " + words.get(i));
		}
		
		
		//CARA KE 2
	//	while(wordIterator.hasNext())
		//{
			//System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
		//	count++;
		//}
	}
}