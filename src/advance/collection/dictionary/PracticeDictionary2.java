package advance.collection.dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import advance.model.Student;

public class PracticeDictionary2
{
	public static void main(String args[])
    {
		Dictionary<String, Student> students = null; /* students adalah variabel dengan tipe Dictionary dan Dictionary akan berisi sekumpulan data 
														dengan tipe class Student */
		Enumeration<Student> studentIterator = null; /* deklarasi variabel dengan tipe Enumeration<Student> */
        
		int count = 1;
		Student var1 = new Student();
		var1.setStudentNo("NIK-1");
		var1.setName("Ari");
		Student var2 = new Student();
		var2.setStudentNo("NIK-2");
		var2.setName("Budi");
		Student var3 = new Student();
		var3.setStudentNo("NIK-3");
		var3.setName("Choki");
		Student var4 = new Student();
		var4.setStudentNo("NIK-4");
		var4.setName("Endang");
		Student var5 = new Student();
		var5.setStudentNo("NIK-5");
		var5.setName("Endang");
		Student var6 = new Student();
		var6.setStudentNo("NIK-6");
		var6.setName("Fandy");

        /* 	instansiasi object dari class Dictionary<String, Student> 
            object ditampung di variable students dengan tipe Dictionary<String, Student>
        */
		students = new Hashtable<String, Student>();
		students.put(var1.getStudentNo(), var1); /* menambah class Student var1 ke dalam Dictionary */
		students.put(var2.getStudentNo(), var2); /* menambah class Student var2 ke dalam Dictionary */
		students.put(var3.getStudentNo(), var3); /* menambah class Student var3 ke dalam Dictionary */
		students.put(var4.getStudentNo(), var4); /* menambah class Student var4 ke dalam Dictionary */

		// Cara 1 [start]
	    /* mengakses elemen yang ada dalam Dictionary */
	    /*System.out.println("Informasi Dictionary setelah proses pertama");
	    System.out.println("Jumlah elemen dalam Dictionary -> " + students.size());
	    studentIterator = students.elements();
	    while (studentIterator.hasMoreElements())
	    {
	    	System.out.println("Elemen ke-"+count+": " + studentIterator.nextElement().getName());
		    count++;
	    }*/
	    // Cara 1 [end]
	    
	    // Cara 2 [start]
        /* mengakses elemen yang ada dalam Set */
		studentIterator = students.elements();
        for (Enumeration e = students.elements(); e.hasMoreElements();) {
        	System.out.println("Elemen ke-"+count+": " + ((Student)e.nextElement()).getName());
            count++;
         }
        // Cara 2 [end]

	    students.put(var4.getStudentNo(), var4); /* menambah nilai variabel var4 ke dalam Dictionary */
	    students.put(var5.getStudentNo(), var5); /* menambah nilai variabel var5 ke dalam Dictionary */
	    students.put(var6.getStudentNo(), var6); /* menambah nilai variabel var6 ke dalam Dictionary */

	    /* mengakses elemen yang ada dalam List */
	    System.out.println("\nInformasi Dictionary setelah proses kedua");
	    System.out.println("Jumlah elemen dalam Dictionary -> " + students.size());
	    count = 1;
	    studentIterator = students.elements();
	    while (studentIterator.hasMoreElements())
	    {
	    	System.out.println("Elemen ke-"+count+": " + studentIterator.nextElement().getName());
		    count++;
	    }
    }
}