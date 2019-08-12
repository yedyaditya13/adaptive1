package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PracticeList3
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		List<String> words = null;  
		Iterator<String> wordIterator = null; 
		int count = 1;
		String kata1;
		String kata2;
		String kata3;
		String kata4;
		String kata5;
		String kata6;
		
		System.out.print("Masukkan Kata ke-1 : ");
		kata1 = input.nextLine();
		System.out.print("Masukkan Kata ke-2 : ");
		kata2 = input.nextLine();
		System.out.print("Masukkan Kata ke-3 : ");
		kata3 = input.nextLine();
		System.out.print("Masukkan Kata ke-4 : ");
		kata4 = input.nextLine();
		System.out.print("Masukkan Kata ke-5 : ");
		kata5 = input.nextLine();
		System.out.print("Masukkan Kata ke-6 : ");
		kata6 = input.nextLine();
		
		
		//INstansiasi objek dari class Hashset <String> objek ditampung di variabel dengna tipe interface Set<String>
		
		words =  new ArrayList<String>();
		words.add(kata1); // menambah string 'satu' kedalam list dengna menggunakan method add
		words.add(kata2);
		words.add(kata3);
		
		//mengakses elemen yg ada dalam list
		wordIterator=words.iterator();
		
		
		System.out.println("Informasi LIST setelah proses pertama");
		System.out.println("Jumlah elemen dalam LIST --> "+words.size());
		while(wordIterator.hasNext())
		{
			System.out.println("Elemen Ke-"+count+" : "+wordIterator.next());
			count++;
		}
		System.out.println("");
		
		
		words.add(kata4); // menambah string 'satu' kedalam LIST dengna menggunakan method add
		words.add(kata5);
		words.add(kata6);
		
		//mengakses elemen yg ada dalam set
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