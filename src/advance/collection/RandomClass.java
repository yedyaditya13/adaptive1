package advance.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.*;
//import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;

public class RandomClass
{
	private Random random = new Random();
	public static void main(String[]args)
	{
	/*	List<Integer>listRandom= new ArrayList<Integer>();
		listRandom.add(10);
		listRandom.add(20);
		listRandom.add(30);
		listRandom.add(40);
		listRandom.add(50);
		
		RandomClass obj = new RandomClass();
		for(int i=0; i<10; i++)
		{
			System.out.println(obj.getRandomList(listRandom));
		}
		
	}
	
	public int getRandomList(List<Integer>listRandom)
	{
		int index=ThreadLocalRandom.current().nextInt(listRandom.size());
		System.out.println("\nIndex : "+index);
		return listRandom.get(index);
	}*/
	

	/*	List<String>list = new ArrayList<String>();
		list.add("Apel");
		list.add("Jeruk");
		list.add("Pisang");
		list.add("Nangka");
		
		RandomClass obj = new RandomClass();
		for(int i=0; i<10; i++)
		{
			System.out.println(obj.getRandomList(list));
		}
	}
	public String getRandomList(List<String>list)
	{
		int index=random.nextInt(list.size());
		System.out.println("\nIndex : "+index);
		return list.get(index);
	}*/
	
		List<String> list = Arrays.asList("A","B","C");
	
		System.out.println(list);
		
		System.out.println(list);
		
		//shuffle
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
	
}