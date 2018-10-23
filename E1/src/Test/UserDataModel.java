package Test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDataModel 
{
	@SerializedName("userType")
	@Expose
	private String userType;
	@SerializedName("userName")
	@Expose
	private String userName;
	@SerializedName("userEmail")
	@Expose
	private String userEmail;
	@SerializedName("userPassword")
	@Expose
	private String userPassword;
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
