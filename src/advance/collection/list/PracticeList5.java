package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PracticeList5
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		List<String> words = null;  
		Iterator<String> wordIterator = null; 
		int count = 1;
		String inputKata= null;
		int i=0;
		
		
		
		//words.add(inputKata);
		
		System.out.println("Silahkan ketik kata dan akhiri  dengan kata kosong");
		System.out.print("Kata ke"+(i+1)+" :");
		inputKata = input.nextLine();
		words =  new ArrayList<String>();
		//words.add(inputKata);
		//while(inputKata != null && inputKata !="")
		while( inputKata != null && !inputKata.trim().equals("") )
		{
			words.add(inputKata);
			
			System.out.print("Kata ke"+(i+2)+" :");
			inputKata = input.nextLine();
			
			i++;
			
		}
		
		i=0;
		wordIterator=words.iterator();
		System.out.println("Informasi List");
		System.out.println("Jumlah dalam elemen List --> "+ words.size());
		System.out.println("Elemen List :");
		

		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+(i+1)+" : "+wordIterator.next());
			count++;
			i++;
		}
	
	}
}