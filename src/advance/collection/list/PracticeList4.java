package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PracticeList4
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		List<String> words = null;  
		Iterator<String> wordIterator = null; //deklarasi variabel dennga tipe Iterator<String> class untuk looping
		int count = 1;
		String kalimat=null;
		String [] splitArr = null;
		words =  new ArrayList<String>();
		System.out.print("Silahkan ketik sebuah kalimat :");
		kalimat = input.nextLine();
		
	
		splitArr = kalimat.split(" ");
	
		for (int i=0; i < splitArr.length; i++)
		{
			
			words.add(splitArr[i]);
		}
		
		wordIterator=words.iterator();
		System.out.println("Informasi List setelah diproses ");
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
	}
}