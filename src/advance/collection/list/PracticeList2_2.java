package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import advance.model.Student;

public class PracticeList2_2
{
	public static void main(String args[])
    {
		List<Student> students = null; /* students adalah variabel dengan tipe List dan List akan berisi sekumpulan data 
										  dengan tipe class Student */
		Iterator<Student> studentIterator = null; /* deklarasi variabel dengan tipe Iterator<Student> */
        
		int count = 1;
		Student var1 = new Student();
		var1.setName("Ari");
		Student var2 = new Student();
		var2.setName("Budi");
		Student var3 = new Student();
		var3.setName("Choki");
		Student var4 = new Student();
		var4.setName("Endang");
		Student var5 = new Student();
		var5.setName("Endang");
		Student var6 = new Student();
		var6.setName("Fandy");

        /* 	instansiasi object dari class List<Student> 
            object ditampung di variable students dengan tipe List<Student>
        */
		students = new ArrayList<Student>();
		students.add(var1); /* menambah class Student var1 ke dalam List */
		students.add(var2); /* menambah class Student var2 ke dalam List */
		students.add(var2); /* menambah class Student var3 ke dalam List */
		students.add(var3); /* menambah class Student var4 ke dalam List */

		// Cara 1 [start]
	    /* mengakses elemen yang ada dalam List */
	    System.out.println("Informasi List setelah proses pertama");
	    System.out.println("Jumlah elemen dalam List -> " + students.size());
	    /*studentIterator = students.iterator();
	    while (studentIterator.hasNext())
	    {
	    	System.out.println("Elemen ke-"+count+": " + studentIterator.next().getName());
		    count++;
	    }*/
	    // Cara 1 [end]
	    
	    // Cara 2 [start]
        /* mengakses elemen yang ada dalam Set */
        for (Object student : students)
        {
        	//System.out.println("Elemen ke-"+count+": " + student.getName());
        	System.out.println("Elemen ke-"+count+": " + ((Student)student).getName());
            count++;
        }
        // Cara 2 [end]

	    students.add(var4); /* menambah nilai variabel var4 ke dalam List */
	    students.add(var5); /* menambah nilai variabel var5 ke dalam List */
	    students.add(var6); /* menambah nilai variabel var6 ke dalam List */

	    /* mengakses elemen yang ada dalam List */
	    System.out.println("\nInformasi List setelah proses kedua");
	    System.out.println("Jumlah elemen dalam List -> " + students.size());
	    count = 1;
	    studentIterator = students.iterator();
	    while (studentIterator.hasNext())
	    {
	    	System.out.println("Elemen ke-"+count+": " + studentIterator.next().getName());
		    count++;
	    }
    }
}