package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.text.*;
import java.util.*;
import advance.model.Student;

public class PracticeSet6
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		//Set<Student> students = null;  //students adalah variabel dengan tipe interface Set dan Set akan brisi sekumpulan data dengan tipe class string
		//Iterator<Student> studentIterator = null; //deklarasi variabel dennga tipe Iterator<String> class untuk looping
		
		Set<Student> students = null;
		Iterator<Student> studentIterator = null;
		
		String studentNo ;
		String name ;
		String birthPlace ;
		Date birthDate ;
		String gender ;	
		String address ;
		String phoneNumber ;
		String faculty ;
		String strDate;
			
		int jlhDataPelajar=0;
		int i=0;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		students = new HashSet<Student>(); 

		System.out.print("Jumlah Data Pelajar : ");
		studentNo = input.nextLine();
		jlhDataPelajar=Integer.parseInt(studentNo);
		System.out.print("\n");
	
		while(i < jlhDataPelajar)
		{
			System.out.println("Data Pelajar ke-"+(i+1));
			System.out.print("Nomor Pelajar : ");
			studentNo = input.nextLine();
			
			System.out.print("Nama : ");
			name =  input.nextLine();
			
			System.out.print("Tempat Lahir : ");
			birthPlace =  input.nextLine();
			
			
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Tanggal Lahir : ");
			strDate =  input.nextLine();
			
			
				birthDate = new Date();
			try
			{
				
				birthDate = sdf.parse(strDate);
				System.out.println("Berhasil");
				
			}
			catch(ParseException e)
			{
				System.out.println("Tanggal lahir harus dalam format dd/MM/yyyy !!!");
			}
			
			System.out.print("Jenis Kelamin : ");
			gender =  input.nextLine();
			System.out.print("Alamat : ");
			address =  input.nextLine();
			System.out.print("Nomor Telepon : ");
			phoneNumber =  input.nextLine();
			System.out.print("Jurusan : ");
			faculty =  input.nextLine();
			
			System.out.print("\n");
			i++;
			
			Student stdn = new Student();
			stdn.setStudentNo(studentNo);
			stdn.setName(name);
			stdn.setBirthPlace(birthPlace);
			stdn.setBirthDate(birthDate);
			stdn.setGender(gender);
			stdn.setAddress(address);
			stdn.setPhoneNumber(phoneNumber);
			stdn.setFaculty(faculty);
			
			
			students.add(stdn);
			
		}
		
		
		
		studentIterator	= students.iterator();
		System.out.println("==============================================================================================");
		System.out.println("Daftar Pelajar");
		System.out.println("Jumlah elemen dalam set ->" +students.size());
		
		System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
		"No Pel",
		"Nama",
		"Tempat Lahir",
		"Tanggal Lahir",
		"Jenis Kelamin",
		"Alamat",
		"Nomor Telephon",
		"Jurusan");
		System.out.println("===============================================================================================");

		while(studentIterator.hasNext())
		{
			Student student = studentIterator.next();
			System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
			student.getStudentNo(),
			student.getName(),
			student.getBirthPlace(),
			sdf.format(student.getBirthDate()),
			student.getGender(),
			student.getAddress(),
			student.getPhoneNumber(),
			student.getFaculty());
			//student.getBirthDate());
	
		}

		
	
	}
}