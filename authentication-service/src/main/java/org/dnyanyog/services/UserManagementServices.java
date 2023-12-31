package org.dnyanyog.services;

import java.util.Optional;

import org.dnyanyog.dto.User;
import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.entity.Users;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementServices {
	@Autowired
	UsersRepository userRepo;
	
	public UserResponse addUpdateUser(UserRequest request) {
		
		UserResponse response = new UserResponse();
		Users usersTable = new Users();
		
		usersTable.setAge(request.getAge());
		usersTable.setEmail(request.getEmail());
		usersTable.setpassword(request.getpassword());
		usersTable.setusername(request.getUsername());
	    usersTable = userRepo.save(usersTable);
	    
	    response.setMeassage("User added Successfully");
	    response.setStatus("Success");
	    response.setUserId(usersTable.getUserId());
	    response.setUsername(usersTable.getusername());
	    response.setPassword(usersTable.getpassword());
	    response.setEmail(usersTable.getEmail());
	    response.setAge(usersTable.getAge());
	    
		return response;
	}
	public User getSingleUser(Long userId) {
		User userResponse = new User();
		
		Optional<Users> receivedData = userRepo.findById(userId);
		if(receivedData.isEmpty()) {
			userResponse.setStatus("Fail");
			userResponse.setMessage("User not found");
		}
		else {
			Users user = receivedData.get();
			userResponse.setStatus("Success");
			userResponse.setMessage("User found");
			userResponse.setEmail(user.getEmail());
			userResponse.setUsername(user.getusername());
			userResponse.setPassword(user.getpassword());
			userResponse.setUserId(user.getUserId());
			userResponse.setAge(user.getAge());
		}
		return userResponse;
	}
	public String deleteuser(Long userId) {
	userRepo.deleteById(userId);
		return "Deleted"+userId;
	}

	public UserResponse UpdateUser(Long userId, UserRequest request) {
		
		UserResponse response = new UserResponse();
		Optional<Users> receivedData = userRepo.findById(userId);
		if(receivedData.isPresent()) {
			
		Users usersTable = new Users();
		
		usersTable.setAge(request.getAge());
		usersTable.setEmail(request.getEmail());
		usersTable.setpassword(request.getpassword());
		usersTable.setusername(request.getUsername());
		usersTable.setUserId(userId);
	    usersTable = userRepo.save(usersTable);
	    
	    response.setMeassage("User added Successfully");
	    response.setStatus("Success");
	    response.setUserId(userId);
	    response.setUsername(usersTable.getusername());
	    response.setPassword(usersTable.getpassword());
	    response.setEmail(usersTable.getEmail());
	    response.setAge(usersTable.getAge());
	    
	
	}
		return response;
	}
}
