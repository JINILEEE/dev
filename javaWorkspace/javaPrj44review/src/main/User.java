package main;

public class User {
	
	public User(String id, String pw) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public User() {
		
	}
	
	private String id;
	private String pwd;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPw(String pwd) {
		this.pwd = pwd;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + "]";
	}
	
	

}
