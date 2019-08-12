package advance.model;

import java.util.Date;

public class Student 
{
	private Long id ;
	private String studentNo ;
	private String name ;
	private String birthPlace ;
	private Date birthDate ;
	private String gender ;
	private String address ;
	private String phoneNumber ;
	private String faculty ;
	
	private Integer rank;
	private Float avgValue;
	
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id=id;
	}
	
	public String getStudentNo()
	{
		return studentNo;
	}
	
	public void setStudentNo(String studentNo)
	{
		this.studentNo=studentNo;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getBirthPlace()
	{
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace=birthPlace;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public Date getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(Date birthDate)
	{
		this.birthDate=birthDate;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	
	public  String getFaculty()
	{
		return faculty;
	}
	public void setFaculty(String faculty)
	{
		this.faculty=faculty;
	}
	
}