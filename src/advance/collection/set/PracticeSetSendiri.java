package advance.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.text.*;
import java.util.*;
import advance.model.Student;

public class PracticeSetSendiri
{
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		public static void main(String[] args)
		{
			PracticeSetSendiri set = new PracticeSetSendiri();
			set.run();
		}
		
		public void run()
		{
			Set<Student> students = null;
			students = new HashSet<Student>();
			Iterator<Student> studentIterator =null;
			
			
			String studentNo;
			String name;
			String address;
			String birthPlace;
			Date birthDate;
			String gender;
			String phoneNumber;
			String faculty;
			
			//String strDate=null;
			
			String strJlhPelajar =null;
			int jlhPelajar;
			int i =0;
			
			
			System.out.print("Jumlah Data Pelajar : ");
			strJlhPelajar=input.nextLine();
			jlhPelajar = Integer.parseInt(strJlhPelajar);
			
			System.out.println("\n");
			
			
			while( i < jlhPelajar)
			{
					System.out.println("Date Pelajar Ke-"+(i+1));
					
				//	System.out.print("Nomor Pelajar : ");
				//	studentNo = input.nextLine();
					studentNo = ReadInputString("Nomor Pelajar : ");
					
				//	System.out.print("Nama Pelajar : ");
				//	name = input.nextLine();
					name = ReadInputString("Nama Pelajar : ");
					
				//	System.out.print("Tempat Lahir : ");
				//	birthPlace = input.nextLine();
					birthPlace = ReadInputString("Tempat Lahir : ");
					
				//	sdf = new SimpleDateFormat("dd/MM/yyyy");
					String strDate=null;
					System.out.print("Tanggal Lahir : ");
					strDate = input.nextLine();
					
					
					birthDate= new Date();
					try
					{
							birthDate = sdf.parse(strDate);	
					}
					catch(Exception e)
					{
						System.out.println("Tanggal Lahir harus dalam format dd/MM/yyyy!!!! ");
					}
					
					//System.out.print("Jenis Kelamin : ");
					//gender = input.nextLine();
					gender = ReadInputString("Jenis Kelamin : ");
					
					//System.out.print("Alamat : ");
					//address = input.nextLine();
					address = ReadInputString("Alamat : ");
					
					//System.out.print("Nomor Telepon : ");
					//phoneNumber = input.nextLine();
					phoneNumber = ReadInputString("Nomor Telepon : ");
					
					//System.out.print("Jurusan : ");
					//faculty = input.nextLine();
					faculty = ReadInputString("Jurusan : ");
					System.out.println("\n");
					i++;
					
					Student pelajar = new Student();
					pelajar.setStudentNo(studentNo);
					pelajar.setName(name);
					pelajar.setBirthPlace(birthPlace);
					pelajar.setBirthDate(birthDate);
					pelajar.setGender(gender);
					pelajar.setAddress(address);
					pelajar.setPhoneNumber(phoneNumber);
					pelajar.setFaculty(faculty);
					
					students.add(pelajar);
					
					
			}
			
					studentIterator	= students.iterator();
					System.out.println("================================================================================================");
					System.out.println("Daftar Pelajar");
					System.out.println("Jumlah Elemen Dalam Set ->" +jlhPelajar);
					
					System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
					"No Pel",
					"Nama",
					"Tempat Lahir",
					"Tanggal Lahir",
					"Jenis Kelamin",
					"Alamat",
					"Nomor Telephon",
					"Jurusan");
					System.out.println("=================================================================================================");
		
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
			
			String searchNoPelajar = null;
			boolean ketemu=true;
	//	System.out.print(students.size());
				while(ketemu)
				{
					System.out.print("Masukkan No Pelajar : ");
					searchNoPelajar = input.nextLine();
				//	ReadInputString(" Masukkan Nomor Pelajar : ");
					try
					{
						for (Student std : students)
						{
							System.out.println("stu no = " + std.getStudentNo());
							System.out.println("searchNoPelajar = " + searchNoPelajar);
							if (std.getStudentNo().equals(searchNoPelajar))
							{
								studentIterator	= students.iterator();
								System.out.println("==============================================================================================");
								System.out.println("Daftar Pelajar");
								System.out.println("Jumlah elemen dalam set -> 1");
								
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

								//Student student = studentIterator.next();			
								System.out.format("%-8s%-6s%-16s%-16s%-16s%-10s%-16s%-16s\n",
								std.getStudentNo(),
								std.getName(),
								std.getBirthPlace(),
								sdf.format(std.getBirthDate()),
								std.getGender(),
								std.getAddress(),
								std.getPhoneNumber(),
								std.getFaculty());
								
								ketemu = false;
								break;
							}
							//break;
						}
						if (ketemu)
						{
							System.out.println("Data Tidak ada!!!");
						}
					}
					catch(Exception e)
					{
						System.out.print("Tidak ada!!");
					}
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