package servicio.domain;

public class User {

	private String strEmail;
	private String strUserId;
	private String strName;
	private String strSurname;
	
	public User(String strEmail, String strUserId, String strName, String strSurname) {
		super();
		this.strEmail = strEmail;
		this.strUserId = strUserId;
		this.strName = strName;
		this.strSurname = strSurname;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrSurname() {
		return strSurname;
	}
	public void setStrSurname(String strSurname) {
		this.strSurname = strSurname;
	}
	
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrUserId() {
		return strUserId;
	}
	public void setStrUserId(String strUserId) {
		this.strUserId = strUserId;
	}
	
	
}
