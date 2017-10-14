package service.domain;

public class Order {
private String strIdUser;
public Order(String strIdUser, String strOrderId, String strFlag) {
	super();
	this.strIdUser = strIdUser;
	this.strOrderId = strOrderId;
	this.strFlag = strFlag;
}
private String strOrderId;
public String getStrIdUser() {
	return strIdUser;
}
public void setStrIdUser(String strIdUser) {
	this.strIdUser = strIdUser;
}
public String getStrOrderId() {
	return strOrderId;
}
public void setStrOrderId(String strOrderId) {
	this.strOrderId = strOrderId;
}
public String getStrFlag() {
	return strFlag;
}
public void setStrFlag(String strFlag) {
	this.strFlag = strFlag;
}
private String strFlag;
}
