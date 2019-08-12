package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import advance.model.Student;

public class PracticeSet2_2
{
	public static void main(String args[])
	{
		Set<Student> students = null; /* deklarasi variabel dengan tipe Set<Student> */
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
		
		
		/*	instansiasi object dari class HashSet<Student> 
			object ditampung di variable students dengan tipe Set<Student>
		*/
        students = new HashSet<Student>(); 
        students.add(var1); /* menambah class Student var1 ke dalam Set */
        students.add(var2); /* menambah class Student var2 ke dalam Set */
        students.add(var3); /* menambah class Student var3 ke dalam Set */
        students.add(var4); /* menambah class Student var4 ke dalam Set */
		
		// Cara 1 [start]
		/* mengakses elemen yang ada dalam Set */
        studentIterator = students.iterator();
		System.out.println("Informasi Set setelah proses pertama");
		System.out.println("Jumlah elemen dalam Set -> " + students.size());
		while (studentIterator.hasNext())
		{
			System.out.println("Elemen ke-" + count + ": " + studentIterator.next().getName());
			count++;
		}
		// Cara 1 [end]
		
		// Cara 2 [start]
        /* mengakses elemen yang ada dalam Set */
        /*for (Student student : students)
        {
        	System.out.println("Elemen ke-"+count+": " + student.getName());
            count++;
        }*/
        // Cara 2 [end]

		students.add(var4); /* menambah nilai variabel var4 ke dalam Set */
		students.add(var5); /* menambah nilai variabel var5 ke dalam Set */
		students.add(var6); /* menambah nilai variabel var6 ke dalam Set */

		/* mengakses elemen yang ada dalam Set */
		studentIterator = students.iterator();
		System.out.println("\nInformasi Set setelah proses kedua");
		System.out.println("Jumlah elemen dalam Set -> " + students.size());
		count = 1;
		while (studentIterator.hasNext())
		{
			System.out.println("Elemen ke-" + count + ": " + studentIterator.next().getName());
			count++;
		}
	}
}
