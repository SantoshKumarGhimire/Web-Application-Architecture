package waa.lab4.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Customer {
	
	@NotEmpty(message="username should not be empty") 
	@Size(min = 1, max = 20,message="username shoud have 2 to 20 length")
	@Pattern(regexp = "[a-zA-Z]*", message = "Must be Character Only")
	private String userName;
	
	@NotEmpty(message="Address should not be empty")
	private String address;
	
	@Past(message="Date of Birth should be before today")
	private Date birthDate;
	
	@Size(min = 6, max = 50, message="password should be between 6 and 50 characters")
	@Pattern(regexp = "[a-zA-Z]*",message="Must be Character Only")
	private String password;
	
	@NotNull(message="Sex should be selected")
	private String sex;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
