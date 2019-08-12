package intermediate;

class User {
    private String username;
    private String password;

    // ini method setter
	public static void main(String args[])
	{
			
		// membuat objek dari class User
		User dian = new User();

		// menggunakan method setter
		dian.setUsername("dian");
		dian.setPassword("kopiJava");

		// menggunakan method getter	
		System.out.println("Username: " + dian.getUsername());
		System.out.println("Password: " + dian.getPassword());  
	}

   public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // ini method getter
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
