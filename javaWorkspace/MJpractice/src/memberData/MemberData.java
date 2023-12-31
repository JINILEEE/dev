package memberData;

public class MemberData {

	//기본생성자
	public MemberData() {
		
	}
	
	//id,pwd만 있는 생성자
	public MemberData(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	//모든 필드 채우는 생성자
	public MemberData(String id, String pwd, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}
	
	//필드 == 멤버 변수
	private String id;
	private String pwd;
	private String nick;
	
	//getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd(){
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	//toString 
	@Override
	public String toString () {
		return "MemberData ID: " + id + " / PW: " + pwd + " / NickName: " + nick;
	}
	
	
}
