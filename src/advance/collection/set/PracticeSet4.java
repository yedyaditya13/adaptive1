package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class PracticeSet4
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		Set<String> words = null;  //words adalah variabel dengan tipe interface Set dan Set akan brisi sekumpulan data dengan tipe class string
		Iterator<String> wordIterator = null; //deklarasi variabel dennga tipe Iterator<String> class untuk looping
		int count = 1;
		String kalimat=null;
		String [] splitArr = null;
		words =  new HashSet<String>();
		System.out.print("Silahkan ketik sebuah kalimat :");
		kalimat = input.nextLine();
		
	
		splitArr = kalimat.split(" ");
	
		for (int i=0; i < splitArr.length; i++)
		{
			
			words.add(splitArr[i]);
		}
		
		wordIterator=words.iterator();
		System.out.println("Informasi Set setelah proses kedua");
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
	}
}