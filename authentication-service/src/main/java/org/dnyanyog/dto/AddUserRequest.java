package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class AddUserRequest {
	private String UserId;
	private String username;
	private String useremail;
	private String userage;
	
	public String getUserId() {
		return UserId;
		
	}
	public void setuserid(String UserId) {
		this.UserId = UserId;
		
	}

	public String getusername() {
		return username;
		
	}
	public void setusername(String username) {
		this.username = username;
		
	}
	public String getuseremail() {
		return useremail;
		
	}
	public void setuseremail(String useremail) {
		this.useremail = useremail;
		
	}
	public String getuserage() {
		return userage;
		
	}
	public void setuserage(String userage) {
		this.userage = userage;
		
	}
	
	
}