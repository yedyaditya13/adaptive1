package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class PracticeSet5
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		Set<String> words = null;  //words adalah variabel dengan tipe interface Set dan Set akan brisi sekumpulan data dengan tipe class string
		Iterator<String> wordIterator = null; //deklarasi variabel dennga tipe Iterator<String> class untuk looping
		int count = 1;
		String inputKata= null;
		int i=0;
		
		
		
		//words.add(inputKata);
		
		System.out.println("Silahkan ketik kata dan akhiri  dengan kata kosong");
		System.out.print("Kata ke"+(i+1)+" :");
		inputKata = input.nextLine();
		words =  new HashSet<String>();
		//words.add(inputKata);
		//while(inputKata != null && inputKata !="")
		while( inputKata != null && !inputKata.trim().equals("") )
		{
			words.add(inputKata);
			
			System.out.print("Kata ke"+(i+2)+" :");
			inputKata = input.nextLine();
			
			
			
			i++;
			/*if (inputKata.equals(""))
			{
				//System.out.println("Cetakkk");
				break;
			}*/
			
		}
		
		i=0;
		wordIterator=words.iterator();
		System.out.println("Informasi Set");
		System.out.println("Jumlah dalam elemen set --> "+ words.size());
		System.out.println("Elemen Set :");
		

		while(wordIterator.hasNext())
		{
			System.out.println("Elemen "+wordIterator.next());
			count++;
		}
	
	}
}