package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponse {

	private String status;
	private String meassage;
	private long UserId;
	private String Username;
	private String Password;
	private String Email;
	private String Age;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String Age) {
		this.Age = Age;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMeassage() {
		return meassage;
	}
	public void setMeassage(String meassage) {
		this.meassage = meassage;
	}
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long UserId) {
		this.UserId = UserId;
	}
	
}
