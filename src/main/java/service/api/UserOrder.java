package service.api;

public class UserOrder {

	private String strEmail;
	@Override
	public String toString() {
		return "UserOrder [strEmail=" + strEmail + ", strOrderId=" + strOrderId + ", strName=" + strName
				+ ", strSurname=" + strSurname + ", strUserId=" + strUserId + ", strOrderState=" + strOrderState + "]";
	}

	private String strOrderId;

	public UserOrder(String strEmail, String strOrderId, String strName, String strSurname, String strUserId,
			String strOrderState) {
		super();
		this.strEmail = strEmail;
		this.strOrderId = strOrderId;
		this.strName = strName;
		this.strSurname = strSurname;
		this.strUserId = strUserId;
		this.strOrderState = strOrderState;
	}

	public String getStrOrderId() {
		return strOrderId;
	}

	public void setStrOrderId(String strOrderId) {
		this.strOrderId = strOrderId;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
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

	public String getStrUserId() {
		return strUserId;
	}

	public void setStrUserId(String strUserId) {
		this.strUserId = strUserId;
	}

	public String getStrOrderState() {
		return strOrderState;
	}

	public void setStrOrderState(String strOrderState) {
		this.strOrderState = strOrderState;
	}

	private String strName;
	private String strSurname;
	private String strUserId;
	private String strOrderState;

}
