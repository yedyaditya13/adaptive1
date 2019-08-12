

package advance.model;

import java.util.Date;

public class Pelajar
{
	private Long id ;
	private String strNoPelajar ;
	private String strNama ;
	private String strTempatLahir ;
	private Date tanggalLahir ;
	private String strJenisKelamin ;
	private String strAlamat ;
	private String strNoTelp ;
	private String strJurusan ;
	
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
	
	public String getNoPelajar()
	{
		return strNoPelajar;
	}
	
	public void setNoPelajar(String strNoPelajar)
	{
		this.strNoPelajar=strNoPelajar;
	}
	public String getNama()
	{
		return strNama;
	}
	public void setNama(String strNama)
	{
		this.strNama=strNama;
	}
	public String getTempatLahir()
	{
		return strTempatLahir;
	}
	public void setTempatLahir(String strTempatLahir)
	{
		this.strTempatLahir=strTempatLahir;
	}
	public String getJenisKelamin()
	{
		return strJenisKelamin;
	}
	public void setJenisKelamin(String strJenisKelamin)
	{
		this.strJenisKelamin=strJenisKelamin;
	}
	
	public Date getTanggaLahir()
	{
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir)
	{
		this.tanggalLahir=tanggalLahir;
	}
	
	public String getAlamat()
	{
		return strAlamat;
	}
	public void setAlamat(String strAlamat)
	{
		this.strAlamat=strAlamat;
	}
	
	public String getNoTelp()
	{
		return strNoTelp;
	}
	public void setNoTelp(String strNoTelp)
	{
		this.strNoTelp=strNoTelp;
	}
	
	public  String getJurusan()
	{
		return strJurusan;
	}
	public void setJurusan(String strJurusan)
	{
		this.strJurusan=strJurusan;
	}
	
}