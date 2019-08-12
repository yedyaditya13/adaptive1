package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.text.*;
import java.util.*;
import advance.model.Student;

public class PracticeList7
{
	Scanner input = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String args[])
	{
		
		PracticeList7 list7 = new PracticeList7	();
		list7.run();
	}
	 public void run() 
	{	
		List<Student> students = null;
		Iterator<Student> studentIterator = null;
		
		String studentNo;
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
		boolean validData = true;
		
		students = new ArrayList<Student>(); 

		System.out.print("Jumlah Data Pelajar : ");
		studentNo = input.nextLine();
		jlhDataPelajar=Integer.parseInt(studentNo);
		System.out.print("\n");
		
		//ReadInputString readInput = new ReadInputString();
	//	readInput 
	
		while(i < jlhDataPelajar)
		{
			System.out.println("Data Pelajar ke-"+(i+1));
			
			
			//System.out.print("Nomor Pelajar : ");
			//studentNo = input.nextLine();
			studentNo = ReadInputString("Nomor Pelajar :");
			
			//System.out.print("Nama : ");
			//name =  input.nextLine();
			name = ReadInputString("Nama :");
			
			//System.out.print("Tempat Lahir : ");
			//birthPlace =  input.nextLine();
			birthPlace = ReadInputString("Tempat Lahir :");
			
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
			
			//System.out.print("Jenis Kelamin : ");
			//gender =  input.nextLine();
			gender = ReadInputString("Jenis Kelamin :");
			//System.out.print("Alamat : ");
			//address =  input.nextLine();
			address = ReadInputString("Alamat :");
			//System.out.print("Nomor Telepon : ");
			//phoneNumber =  input.nextLine();
			phoneNumber = ReadInputString("No Telepon :");
			
			//System.out.print("Jurusan : ");
			//faculty =  input.nextLine();
			faculty = ReadInputString("Jurusan :");
			
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
	
	private String ReadInputString (String mesg)
	{
		Boolean isValid=true;
		String strInput = null;
		do
		{
			isValid = true;
			System.out.print(mesg);
		
			strInput = input.nextLine();
			if (strInput.isEmpty())
			{
				System.out.println("Inputan tidak boleh Kosong");
				isValid = false;
			}
		}
		while(!isValid);
		return strInput;
	}

	public Date ReadInputDateTime(String question)
	{
		boolean isValid = false;
		String str=null;
		Date result =null;
		do{
			System.out.println(question);
			str = input.nextLine();
			if(str ==null || str.isEmpty())
			{
				System.out.println("Inputan tidak boleh kosong");
				isValid=false;
				continue;
			}
		
			if (str != null && !str.isEmpty())
			{
				try
				{
					result = sdf.parse(str);
					isValid=true;
				}
				catch(Exception ex)
				{
					isValid=false;
					continue;
				}
			}
			else
			{
				result = null;
				isValid=true;
			}
			
		}
		while(!isValid);
		return result;
	}
}