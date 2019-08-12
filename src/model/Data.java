package model;

import java.util.Date;

public class Data 
{
	private String nik ;
	private String nama ;
	private Date tglLahir ;
	private int peringkat ;
	private float ipk ;
	
	
	public String getNik()
	{
		return nik;
	}
	
	public void setNik(String nik)
	{
		this.nik=nik;
	}
	
	
	public String getNama()
	{
		return nama;
	}
	public void setNama(String nama)
	{
		this.nama=nama;
	}

	
	public Date getTglLahir()
	{
		return tglLahir;
	}
	public void setTglLahir(Date tglLahir)
	{
		this.tglLahir=tglLahir;
	}
	
	public  float getIpk()
	{
		return ipk;
	}
	public void setIpk(float ipk)
	{
		this.ipk=ipk;
	}

	public  int getPeringkat()
	{
		return peringkat;
	}
	public void setPeringkat(int peringkat)
	{
		this.peringkat=peringkat;
	}
	
}