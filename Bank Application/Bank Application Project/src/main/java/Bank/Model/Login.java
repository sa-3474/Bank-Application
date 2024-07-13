package Bank.Model;

public class Login {
	private int regNo;
	private String password;
	public Login(int regNo, String password) {
		super();
		this.regNo = regNo;
		this.password = password;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
